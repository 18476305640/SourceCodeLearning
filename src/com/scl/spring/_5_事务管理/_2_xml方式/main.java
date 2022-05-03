package com.scl.spring._5_事务管理._2_xml方式;

import com.scl.spring._5_事务管理._2_xml方式.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/scl/spring/_5_事务管理/_2_xml方式/_2_xml方式.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.transfer();
    }
}
