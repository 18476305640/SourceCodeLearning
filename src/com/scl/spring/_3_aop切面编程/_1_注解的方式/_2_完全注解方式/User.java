package com.scl.spring._3_aop切面编程._1_注解的方式._2_完全注解方式;

import org.springframework.stereotype.Component;

@Component
public class User {
    public void add() {
        System.out.println("[切入点主体 add....]");
        int i = 1/0;
    }
}
