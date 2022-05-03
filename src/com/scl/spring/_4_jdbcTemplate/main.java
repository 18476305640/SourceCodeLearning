package com.scl.spring._4_jdbcTemplate;

import com.scl.spring._4_jdbcTemplate.entity.Book;
import com.scl.spring._4_jdbcTemplate.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    @Test
    public  void add() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/scl/spring/_4_jdbcTemplate/_4_jdbcTemplate.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        /*增*/
        Book book = new Book();
        book.setBookId(4);
        book.setName("西游记");
        book.setAuthor("吴承恩");
        int i = bookService.add(book);
        System.out.println(i);

    }
    @Test
    public void delete() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/scl/spring/_4_jdbcTemplate/_4_jdbcTemplate.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        /*删*/
        int delete = bookService.delete(1);
        System.out.println(delete);
    }
    @Test
    public void update() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/scl/spring/_4_jdbcTemplate/_4_jdbcTemplate.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        /*改*/
        Book book = new Book();
        book.setBookId(4);
        book.setName("西游记44");
        book.setAuthor("吴承恩44");
        int delete = bookService.update(book);
        System.out.println(delete);
    }
    @Test
    public void select() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/scl/spring/_4_jdbcTemplate/_4_jdbcTemplate.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        /*查*/
        Book queryOne = bookService.queryOne(4);
        System.out.println(queryOne);
    }



}
