package com.scl.spring._2_ioc管理bean._1_xml方式._2_注入属性._2_构造方法注入;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/scl/spring/_2_ioc管理bean/_1_xml方式/_2_注入属性/_2_构造方法注入/_2_构造方法注入.xml");
        Book book = context.getBean("book", Book.class);
        book.show();

    }
}
