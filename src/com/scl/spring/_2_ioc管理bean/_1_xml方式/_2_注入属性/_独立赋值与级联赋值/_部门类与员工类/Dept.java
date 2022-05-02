package com.scl.spring._2_ioc管理bean._1_xml方式._2_注入属性._独立赋值与级联赋值._部门类与员工类;

/**
 * 部门类
 */
public class Dept {
    private String dname;
    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
