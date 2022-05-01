package com.scl.spring._2_ioc管理bean._1_xml方式._2_注入属性._2_构造方法注入;

public class Book {
    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public void show() {
        System.out.println("name="+name+",author="+author);
    }

}
