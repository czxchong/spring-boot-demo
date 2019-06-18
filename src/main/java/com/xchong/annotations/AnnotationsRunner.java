package com.xchong.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Objects;

/**
 * @author xchong
 * @create 2019-06-18 16:18
 * description: 运行注解
 */
public class AnnotationsRunner {

    public static void main(String[] args) throws Exception {
        System.out.println("执行自定义注解开始时间："+new Date());
        Class clazz = AnnotationsInstance.class;
        Method[] ms = clazz.getDeclaredMethods();
        for (Method method : ms) {
            MyAnnotations anotation = method.getAnnotation(MyAnnotations.class);
            if (Objects.nonNull(anotation)) {
                System.out.println("name："+ anotation.name());
                System.out.println("age:" +  anotation.age());
            }
        }
    }

}
