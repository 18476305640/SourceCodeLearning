package com.scl.spring._2_ioc管理bean._2_注解方式._1_创建对象._2_完全注解;

import com.scl.spring._2_ioc管理bean._2_注解方式._1_创建对象._2_完全注解.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.insert();
    }
}
