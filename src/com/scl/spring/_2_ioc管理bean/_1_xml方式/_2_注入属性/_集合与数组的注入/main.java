package com.scl.spring._2_ioc管理bean._1_xml方式._2_注入属性._集合与数组的注入;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext context =  new ClassPathXmlApplicationContext("com/scl/spring/_2_ioc管理bean/_1_xml方式/_2_注入属性/_集合与数组的注入/_集合与数组的注入.xml");
        Stu stu = context.getBean("stu", Stu.class);
        System.out.println(stu);
    }
}
