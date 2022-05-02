package com.scl.spring._2_ioc管理bean._1_xml方式._1_创建对象._Bean的生命周期._加入前置与后置处理器共七步;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPost implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("=>在初始化方法执行之前");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("<=在初始化方法执行之后");
        return bean;
    }
}
