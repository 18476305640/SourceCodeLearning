package com.scl.spring._2_ioc管理bean._2_注解方式._2_注入属性._2_基本类型注入;

import com.scl.spring._2_ioc管理bean._2_注解方式._2_注入属性._1_引用类型注入.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/scl/spring/_2_ioc管理bean/_2_注解方式/_2_注入属性/_2_基本类型注入/_2_基本类型注入.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
    }
}
