package com.scl.spring._2_ioc管理bean._1_xml方式._2_注入属性._独立赋值与级联赋值;

import com.scl.spring._2_ioc管理bean._1_xml方式._2_注入属性._独立赋值与级联赋值._部门类与员工类.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        //独立赋值
        ApplicationContext context = new ClassPathXmlApplicationContext("com/scl/spring/_2_ioc管理bean/_1_xml方式/_2_注入属性/_独立赋值与级联赋值/_独立赋值.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);

        //级联赋值
        ApplicationContext context2 = new ClassPathXmlApplicationContext("com/scl/spring/_2_ioc管理bean/_1_xml方式/_2_注入属性/_独立赋值与级联赋值/_级联赋值.xml");
        Emp emp2 = context2.getBean("emp", Emp.class);
        System.out.println(emp2);
    }
}
