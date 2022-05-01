package com.scl.spring._2_ioc管理bean._1_xml方式._2_注入属性._注入属性bean;

import com.scl.spring._2_ioc管理bean._1_xml方式._2_注入属性._注入属性bean.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/scl/spring/_2_ioc管理bean/_1_xml方式/_2_注入属性/_注入属性bean/_注入属性bean.xml");
        UserServiceImpl userService = context.getBean("UserService", UserServiceImpl.class);
        userService.insert();
    }
}
