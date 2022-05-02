package com.scl.spring._3_aop切面编程._1_注解的方式._2_完全注解方式;

import com.scl.spring._2_ioc管理bean._2_注解方式._1_创建对象._2_完全注解.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigAop.class);
        User user = context.getBean("user", User.class);
        user.add();
    }
}
