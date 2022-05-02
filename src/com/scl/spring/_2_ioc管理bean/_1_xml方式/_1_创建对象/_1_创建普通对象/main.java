package com.scl.spring._2_ioc管理bean._1_xml方式._1_创建对象._1_创建普通对象;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        //加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("com/scl/spring/_2_ioc管理bean/_1_xml方式/_1_创建对象/_1_创建普通对象/_1_创建对象.xml");
        //从中获取生成的对象
        User user = context.getBean("user", User.class);
        //对象的调用测试
        user.run();
    }
}

