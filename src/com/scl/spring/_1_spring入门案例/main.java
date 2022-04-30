package com.scl.spring._1_spring入门案例;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        //加载spring配置文件
        BeanFactory context = new ClassPathXmlApplicationContext("com/scl/spring/_1_spring入门案例/_1_spring入门案例.xml");
        //从中获取生成的对象
        User user = context.getBean("user", User.class);
        //对象的调用测试
        user.run();
    }
}

