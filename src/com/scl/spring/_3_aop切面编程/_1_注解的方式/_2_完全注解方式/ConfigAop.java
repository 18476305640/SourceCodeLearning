package com.scl.spring._3_aop切面编程._1_注解的方式._2_完全注解方式;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages={"com.scl.spring._3_aop切面编程._1_注解的方式._2_完全注解方式"})
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class ConfigAop {

}
