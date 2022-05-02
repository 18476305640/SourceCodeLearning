package com.scl.spring._2_ioc管理bean._2_注解方式._1_创建对象._1_原始方式;

import com.scl.spring._2_ioc管理bean._2_注解方式._1_创建对象._1_原始方式.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/scl/spring/_2_ioc管理bean/_2_注解方式/_1_创建对象/_1_原始方式/_1_原始方式.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.insert();
    }
}
