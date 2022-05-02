package com.scl.spring._2_ioc管理bean._1_xml方式._2_注入属性._自动注入;

public class User {
    private String id;
    private Book book;

    public void setId(String id) {
        this.id = id;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", book=" + book +
                '}';
    }
}
