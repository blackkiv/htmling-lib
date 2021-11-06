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
    ClassPropertyData classPropertyData = getClassProperty(clazz);
    PropertyData propertyData =
        new PropertyData("", classPropertyData.tag, classPropertyData.styles);
    String prefix = resolveTagPrefix(propertyData, "className", clazz.getSimpleName());
    String suffix = "</" + classPropertyData.tag + ">";
    StringJoiner joiner =
        new StringJoiner("", prefix, suffix)
            .add(getTitleRepresentation(classPropertyData.title));
    Arrays.stream(fields)
        .filter(field -> !field.isAnnotationPresent(Ignore.class))
        .map(field -> getFieldRepresentation(object, field))
        .forEach(joiner::add);
    return joiner.toString();
  }

  private static String getTitleRepresentation(PropertyData title) {
    String prefix = resolveTagPrefix(title, "title", "title");
    String suffix = resolveTagSuffix(title.tag);
    return prefix + title.value + suffix;
  }

  private static String getFieldRepresentation(Object object, Field field) {
    Object value = getFieldValue(object, field);
    if (value == null) {
      logger.log(Level.INFO, "no data in field: {0} in class: {1}",
          new String[]{field.getName(), object.getClass().getSimpleName()});
      return "";
    }
    PropertyData propertyData = getFieldProperty(field);
    String prefix = resolveTagPrefix(propertyData, "field", field.getName());
    String suffix = resolveTagSuffix(propertyData.tag);
    String name = propertyData.value.equals("")
        ? field.getName()
        : propertyData.value;
    return prefix + name + " : " + value + suffix;
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
      try {
        String tag = Property.class
            .getDeclaredMethod("tag")
            .getDefaultValue()
            .toString();
        return new PropertyData(field.getName(), tag, "");
      } catch (NoSuchMethodException e) {
        logger.log(Level.WARNING, "no tag method in annotation Property");
      }
    }
    Property annotation = field.getAnnotation(Property.class);
    return resolveProperty(annotation);
  }

  private static ClassPropertyData getClassProperty(Class<?> clazz) {
    Htmling annotation = clazz.getAnnotation(Htmling.class);
    PropertyData title = resolveProperty(annotation.title());
    String styles = resolveStyles(annotation.styles());
    String tag = annotation.tag().toString();
    return new ClassPropertyData(title, tag, styles);
  }

  private static PropertyData resolveProperty(Property annotation) {
    String name = annotation.value();
    String styles = resolveStyles(annotation.styles());
    String tag = annotation.tag().toString();
    return new PropertyData(name, tag, styles);
  }

  private static String resolveStyles(Style[] annotations) {
    if (annotations.length == 0) {
      return "";
    }
    return Arrays.stream(annotations)
        .map(style -> style.property() + ":" + style.value() + ";")
        .collect(Collectors.joining());
  }

  private static String resolveTagPrefix(PropertyData data, String prefixName, String prefixValue) {
    return "<" + data.tag + " " + prefixName + "=\"" + prefixValue + "\"" +
        (data.styles.equals("")
            ? ">"
            : String.format(" style=\"%s\">", data.styles));
  }

  private static String resolveTagSuffix(String tag) {
    return "</" + tag + ">";
  }

  private record ClassPropertyData(PropertyData title, String tag, String styles) {

  }

  private record PropertyData(String value, String tag, String styles) {

  }
}
