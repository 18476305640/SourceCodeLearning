package com.scl.spring._2_ioc管理bean._1_xml方式._1_创建对象._Bean的生命周期;

public class Life {
    public String id;

    public Life() {
        System.out.println("第一步 执行构造方法创建Bean实例");
    }

    public void setId(String id) {
        this.id = id;
        System.out.println("第二步执行set方法设置属性值");
    }

    public void initMethod() {
        System.out.println("第三步 执行初始化方法");
    }
    public void destroyMethod() {
        System.out.println("第五步 执行初始化方法");
    }
}
