package com.scl.spring._2_ioc管理bean._1_xml方式._2_注入属性._1_set方法注入;

public class Book {
    private String name;
    private String author;

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public void show() {
        System.out.println("name="+name+",author="+author);
    }

}
