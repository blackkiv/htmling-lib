package com.github.blck.htmling.util;

import com.github.blck.htmling.annotation.Htmling;
import com.github.blck.htmling.annotation.Ignore;
import com.github.blck.htmling.annotation.Property;
import com.github.blck.htmling.annotation.Style;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class HtmlingUtil {

  private static final Logger logger = Logger.getLogger("htmling-logger");

  private HtmlingUtil() {
  }

  /**
   * Return html representation of an object
   *
   * @param object The object to serialize
   * @return The representation of an object
   */
  public static String htmling(Object object) {
    return getClassRepresentation(object);
  }

  private static String getClassRepresentation(Object object) {
    Class<?> clazz = object.getClass();
    Field[] fields = clazz.getDeclaredFields();
    PropertyData propertyData = getClassProperty(clazz);
    String prefix = "<div" +
        (propertyData.styles.equals("")
            ? ">"
            : String.format(" style=\"%s\">", propertyData.styles));
    StringJoiner joiner =
        new StringJoiner("", prefix, "</div>")
            .add(getClassNameRepresentation(propertyData.name));
    Arrays.stream(fields)
        .filter(field -> !field.isAnnotationPresent(Ignore.class))
        .map(field -> getFieldRepresentation(object, field))
        .forEach(joiner::add);
    return joiner.toString();
  }

  private static String getClassNameRepresentation(String className) {
    return String.format("<h1>%s</h1>", className);
  }

  private static String getFieldRepresentation(Object object, Field field) {
    Object value = getFieldValue(object, field);
    if (value == null) {
      logger.log(Level.INFO, "no data in field: {0} in class: {1}",
          new String[]{field.getName(), object.getClass().getSimpleName()});
      return "";
    }
    PropertyData propertyData = getFieldProperty(field);
    String styles = propertyData.styles;
    String prefix = "<div" +
        (styles.equals("")
            ? ">"
            : String.format(" style=\"%s\">", styles));
    return prefix + propertyData.name + " : " + value + "</div>";
  }

  private static Object getFieldValue(Object object, Field field) {
    Object value = null;
    Class<?> clazz = object.getClass();
    try {
      if (field.canAccess(object)) {
        value = field.get(object);
      } else {
        String getterPrefix = clazz.getAnnotation(Htmling.class).getterPrefix();
        String fieldName = field.getName();
        String getterFieldName = getterPrefix.equals("")
            ? fieldName
            : fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
        value = clazz.getMethod(getterPrefix + getterFieldName).invoke(object);
      }
    } catch (IllegalAccessException ex) {
      logger.log(Level.WARNING, "illegal access exception on field: {0} in class: {1}",
          new String[]{field.getName(), clazz.getSimpleName()});
    } catch (NoSuchMethodException | InvocationTargetException ex) {
      logger.log(Level.WARNING, "no such method for field {0} in class: {1}",
          new String[]{field.getName(), clazz.getSimpleName()});
    }
    return value;
  }

  private static PropertyData getFieldProperty(Field field) {
    if (!field.isAnnotationPresent(Property.class)) {
      return new PropertyData(field.getName(), "");
    }
    Property annotation = field.getAnnotation(Property.class);
    String name = annotation.value().equals("")
        ? field.getName()
        : annotation.value();
    String styles = resolveStyles(annotation.styles());
    return new PropertyData(name, styles);
  }

  private static PropertyData getClassProperty(Class<?> clazz) {
    Htmling annotation = clazz.getAnnotation(Htmling.class);
    String name = annotation.value().equals("")
        ? clazz.getSimpleName()
        : annotation.value();
    String styles = resolveStyles(annotation.styles());
    return new PropertyData(name, styles);
  }

  private static String resolveStyles(Style[] annotations) {
    if (annotations.length == 0) {
      return "";
    }
    return Arrays.stream(annotations)
        .map(style -> style.name() + ":" + style.value() + ";")
        .collect(Collectors.joining());
  }

  private record PropertyData(String name, String styles) {

  }
}

