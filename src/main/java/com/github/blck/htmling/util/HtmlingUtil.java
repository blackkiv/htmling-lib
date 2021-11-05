package com.github.blck.htmling.util;

import com.github.blck.htmling.annotation.Htmling;
import com.github.blck.htmling.annotation.Style;
import com.github.blck.htmling.annotation.Styles;
import com.github.blck.htmling.annotation.Ignore;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
    Class<?> clazz = object.getClass();
    if (clazz.getAnnotationsByType(Htmling.class).length == 0) {
      return "";
    }
    Field[] fields = clazz.getDeclaredFields();
    String styles = getClassStyles(clazz);
    String prefix = "<div" +
        (styles.equals("")
            ? ">"
            : String.format(" style=\"%s\">", styles));
    StringJoiner stringJoiner =
        new StringJoiner("", prefix, "</div>")
            .add(getClassNameRepresentation(clazz));
    Arrays.stream(fields)
        .filter(field -> !field.isAnnotationPresent(Ignore.class))
        .map(field -> getFieldRepresentation(object, field))
        .forEach(stringJoiner::add);
    return stringJoiner.toString();
  }

  private static String getClassNameRepresentation(Class<?> clazz) {
    String name = clazz.getSimpleName();
    return String.format("<h1>%s</h1>", name);
  }

  private static String getFieldRepresentation(Object object, Field field) {
    Object value = getFieldValue(object, field);
    if (value == null) {
      logger.log(Level.INFO, "no data in field: {0} in class: {1}",
          new String[]{field.getName(), object.getClass().getSimpleName()});
      return "";
    }
    String styles = getFieldStyles(field);
    String prefix = "<div" +
        (styles.equals("")
            ? ">"
            : String.format(" style=\"%s\">", styles));
    return prefix + field.getName() + " : " + value + "</div>";
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
        String setterFieldName = getterPrefix.equals("")
            ? fieldName
            : fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
        value = clazz.getMethod(getterPrefix + setterFieldName).invoke(object);
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

  private static String getClassStyles(Class<?> clazz) {
    List<Style> annotations = new ArrayList<>(Arrays.asList(clazz.getAnnotationsByType(Style.class)));
    if (clazz.isAnnotationPresent(Styles.class)) {
      annotations.addAll(Arrays.asList(clazz.getAnnotation(Styles.class).value()));
    }
    return resolveStyles(annotations);
  }

  private static String getFieldStyles(Field field) {
    List<Style> annotations = new ArrayList<>(Arrays.asList(field.getAnnotationsByType(Style.class)));
    if (field.isAnnotationPresent(Styles.class)) {
      annotations.addAll(Arrays.asList(field.getAnnotation(Styles.class).value()));
    }
    return resolveStyles(annotations);
  }

  private static String resolveStyles(List<Style> annotations) {
    if (annotations.isEmpty()) {
      return "";
    }
    return annotations.stream()
        .map(style -> style.name() + ":" + style.value() + ";")
        .collect(Collectors.joining());
  }

}

