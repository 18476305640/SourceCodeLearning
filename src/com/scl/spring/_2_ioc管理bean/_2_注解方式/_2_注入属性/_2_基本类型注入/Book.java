package com.scl.spring._2_ioc管理bean._2_注解方式._2_注入属性._2_基本类型注入;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    //注入基本类型1
    @Value("西游记")
    private String name;
    //注入基本类型2
    @Value("吴承恩")
    private String author;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
