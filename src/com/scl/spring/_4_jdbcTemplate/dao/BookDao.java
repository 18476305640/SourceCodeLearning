package com.scl.spring._4_jdbcTemplate.dao;

import com.scl.spring._4_jdbcTemplate.entity.Book;
import org.springframework.stereotype.Repository;


public interface BookDao {
    public int add(Book book);

    int delete(int book_id);

    int update(Book book);

    Book queryOne(int id);

}
