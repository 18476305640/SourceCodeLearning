package com.scl.spring._2_ioc管理bean._1_xml方式._2_注入属性._结合properties为bean注入属性;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext conext = new ClassPathXmlApplicationContext("com/scl/spring/_2_ioc管理bean/_1_xml方式/_2_注入属性/_结合properties为bean注入属性/结合properties为bean注入.xml");
        DruidDataSource dataSource = conext.getBean("dataSource", DruidDataSource.class);
        System.out.println(dataSource);
    }
}
