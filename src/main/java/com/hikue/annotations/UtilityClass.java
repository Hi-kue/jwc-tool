package com.hikue.annotations;

import java.lang.annotation.*;

@Documented
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface UtilityClass {
    String className() default "UNKNOWN";
}
