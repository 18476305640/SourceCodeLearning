package com.scl.spring._3_aop切面编程._2_xml的方式;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//增强
public class UserProxy {
    public void before() {//前置通知
        System.out.println("前置通知 before....");
    }
}
