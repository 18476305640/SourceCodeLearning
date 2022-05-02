package com.scl.spring._2_ioc管理bean._1_xml方式._2_注入属性._注入提取util;

import org.springframework.beans.factory.config.ListFactoryBean;

import java.util.List;

public class Book {
    public List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Book{" +
                "list=" + list +
                '}';
    }
}
