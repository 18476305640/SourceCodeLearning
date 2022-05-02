package com.scl.spring._2_ioc管理bean._2_注解方式._1_创建对象._2_完全注解.service;

import org.springframework.stereotype.Service;

@Service(value = "userService") //value默认就是类的首字符小写
public class UserService {
    public void insert() {
        System.out.println("完全注解 service add ..");
    }
}
