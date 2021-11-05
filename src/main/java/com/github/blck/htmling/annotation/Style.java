package com.github.blck.htmling.annotation;

import com.github.blck.htmling.enums.CSSProperty;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Style {

  CSSProperty property();

  String value();
}
