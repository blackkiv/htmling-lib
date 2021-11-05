package com.github.blck.htmling.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Htmling {

  String getterPrefix() default "get";

  String value() default "";

  Style[] styles() default {};
}
