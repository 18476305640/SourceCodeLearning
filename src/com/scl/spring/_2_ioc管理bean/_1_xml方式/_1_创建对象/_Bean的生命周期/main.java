package com.scl.spring._2_ioc管理bean._1_xml方式._1_创建对象._Bean的生命周期;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/scl/spring/_2_ioc管理bean/_1_xml方式/_1_创建对象/_Bean的生命周期/_Bean的生命周期.xml");
        Life life = context.getBean("life", Life.class);
        System.out.println(life);
        System.out.println("第四步 获取到了Bean实例");
        //手动让bean实例销毁
        ((ClassPathXmlApplicationContext)context).close();
    }
}
