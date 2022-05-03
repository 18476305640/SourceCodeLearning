package com.scl.spring._5_事务管理._1_注解方式._1_普通方式;

import com.scl.spring._5_事务管理._1_注解方式._1_普通方式.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/scl/spring/_5_事务管理/_1_注解方式/_1_普通方式/_5_事务管理.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.transfer();
    }
}
