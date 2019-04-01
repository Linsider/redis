package com.example.annotation;

import java.lang.annotation.*;

/**
 * author huangtuL
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RedisSelect {
    /**
     * redis库
     * @return
     */
    int value() default 0;
}
