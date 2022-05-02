package com.scl.spring._2_ioc管理bean._1_xml方式._2_注入属性._自动注入;

import com.scl.spring._2_ioc管理bean._1_xml方式._2_注入属性._注入提取util.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/scl/spring/_2_ioc管理bean/_1_xml方式/_2_注入属性/_自动注入/_自动注入.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
}
