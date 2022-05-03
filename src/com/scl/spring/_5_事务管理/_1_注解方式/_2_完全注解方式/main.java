package com.scl.spring._5_事务管理._1_注解方式._2_完全注解方式;

import com.scl.spring._5_事务管理._1_注解方式._2_完全注解方式.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.transfer();
    }
}
