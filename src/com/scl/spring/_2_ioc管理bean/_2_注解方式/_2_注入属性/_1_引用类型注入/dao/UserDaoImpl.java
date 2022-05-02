package com.scl.spring._2_ioc管理bean._2_注解方式._2_注入属性._1_引用类型注入.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements UserDao{
    @Override
    public void insert() {
        System.out.println("UserDao add ...");
    }
}
