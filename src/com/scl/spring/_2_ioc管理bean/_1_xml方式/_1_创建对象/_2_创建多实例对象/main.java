package com.scl.spring._2_ioc管理bean._1_xml方式._1_创建对象._2_创建多实例对象;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/scl/spring/_2_ioc管理bean/_1_xml方式/_1_创建对象/_2_创建多实例对象/_Bean作用域_单多实例.xml");
        User user1 = context.getBean("user", User.class);
        User user2 = context.getBean("user", User.class);
        System.out.println(user1 == user2);
    }
}
