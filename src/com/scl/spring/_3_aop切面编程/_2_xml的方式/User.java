package com.scl.spring._3_aop切面编程._2_xml的方式;

import org.springframework.stereotype.Component;

public class User {
    public void add() {
        System.out.println("[切入点主体 add....]");
    }
}
