package com.xchong.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 这被称为 构造型注释。它为阅读代码的人提供了提示，而为Spring提供了特定角色的提示。
 * 在这种情况下，我们的类是一个Web @Controller，因此Spring在处理传入的Web请求时会考虑它。
 *
 * 该@RequestMapping注释提供“路由”的信息。它告诉Spring，任何带/路径的HTTP请求都应该映射到该home方法。
 * 该 @RestController注解告诉Spring使得到的字符串直接返回给调用者。
 *
 * @EnableAutoConfiguration 这个注释告诉Spring Boot根据你添加的jar依赖关系“猜测”你想要如何配置Spring。
 * 自从spring-boot-starter-web添加了Tomcat和Spring MVC 以来，自动配置假定您正在开发Web应用程序并相应地设置Spring
 */
@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/health")
    String health(String args) {
        return "Hello World!:"+args;
    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);

    }

}