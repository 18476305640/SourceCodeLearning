package com.scl.spring._2_ioc管理bean._2_注解方式._1_创建对象._2_完全注解;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//作为配置类，替代xml配置文件
//设置扫描路径
@ComponentScan(basePackages = {"com.scl.spring._2_ioc管理bean._2_注解方式._1_创建对象._2_完全注解"})
public class SpringConfig {
}
