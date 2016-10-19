package com.zapcg.tutorial.java.annotations.advanced;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target(ElementType.METHOD)		// cannot be applied on class level, compiler restricts it
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {

	String author() default "Srimanta Sahu";

	String date();

	int version() default 1;

	String comments();
}
