package com.github.blck.htmling.annotation;

import com.github.blck.htmling.enums.HTMLTag;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Property {

  String value() default "";

  HTMLTag tag() default HTMLTag.DIV;

  Style[] styles() default {};
}
