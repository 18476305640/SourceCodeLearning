package com.scl.spring._3_aop切面编程._1_注解的方式._2_完全注解方式;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//增强

@Component
@Aspect //生成代理对象
public class UserProxy {

    @Before(value = "execution(* com.scl.spring._3_aop切面编程._1_注解的方式._2_完全注解方式.User.add(..))")
    public void before() {//前置通知
        System.out.println("前置通知 before....");
    }

    @AfterReturning(value = "execution(* com.scl.spring._3_aop切面编程._1_注解的方式._2_完全注解方式.User.add(..))")
    public void afterReturning() {//后置通知
        System.out.println("后置通知 afterReturning....");
    }
    @After(value = "execution(* com.scl.spring._3_aop切面编程._1_注解的方式._2_完全注解方式.User.add(..))")
    public void after() {//后置通知
        System.out.println("最终通知 after....");
    }
    @AfterThrowing(value = "execution(* com.scl.spring._3_aop切面编程._1_注解的方式._2_完全注解方式.User.add(..))",throwing = "e")
    public void afterThrowing(JoinPoint joinPoint,Exception e) {//异常通知
        System.out.println("异常通知 afterThrowing...."+e.getMessage());
    }
    @Around(value = "execution(* com.scl.spring._3_aop切面编程._1_注解的方式._2_完全注解方式.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前........."); //被增强的方法执行
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后.........");
    }




}
