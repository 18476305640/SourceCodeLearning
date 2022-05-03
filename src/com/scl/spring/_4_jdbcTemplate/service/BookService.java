package com.scl.spring._4_jdbcTemplate.service;

import com.scl.spring._4_jdbcTemplate.dao.BookDao;
import com.scl.spring._4_jdbcTemplate.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    //注入dao
    @Autowired
    private BookDao bookDao;
    public int add(Book book) {
        return bookDao.add(book);
    }
    public int delete(int book_id) {
        return bookDao.delete(book_id);
    }

    public int update(Book book) {
        return bookDao.update(book);
    }

    public Book queryOne(int id) {
        return bookDao.queryOne(id);
    }
}
