package com.xchong.annotations;

import java.lang.annotation.*;

/**
 * @author xchong
 * @create 2019-06-18 16:20
 * description: 自定义注解
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public  @interface MyAnnotations {
    String name() default  "xchong";

    int age() default  1;
}
