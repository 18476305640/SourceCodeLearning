package com.scl.spring._2_ioc管理bean._1_xml方式._1_创建对象._3_创建FactoryBean;

import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean<String> {
    @Override
    public String getObject() throws Exception {
        return new String("FactoryBean返回了其它对象");
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
