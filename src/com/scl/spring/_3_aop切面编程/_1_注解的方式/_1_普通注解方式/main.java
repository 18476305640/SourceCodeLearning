package com.scl.spring._3_aop切面编程._1_注解的方式._1_普通注解方式;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/scl/spring/_3_aop切面编程/_1_注解的方式/_1_普通注解方式/_1_注解的方式.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }
}
