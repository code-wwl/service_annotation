package com.humble.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author wenlong wang  
 * @date 2020/11/22 17:04
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
public @interface Service {
    Class value();
}
