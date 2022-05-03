package com.scl.spring._4_jdbcTemplate.dao;

import com.scl.spring._4_jdbcTemplate.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    //注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(Book book) {
        //1 创建sql语句
        String sql = "insert into book values(?,?,?)";
        Object[] args = {book.getBookId(),book.getName(),book.getAuthor()};
        return jdbcTemplate.update(sql, args);

        /*批量添加时-batchUpdate
        * String sql = "insert into t_book values(?,?,?)";
        * int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        * */
    }

    @Override
    public int delete(int book_id) {
        String sql = "delete from book where book_id = ?";
        return jdbcTemplate.update(sql,book_id);

        /*当批量删除时-batchUpdate
        * String sql = "delete from t_book where user_id=?";
        * int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        * */
    }

    @Override
    public int update(Book book) {
        String sql = "update book set name=?,author=? where book_id=?";
        Object[] args = {book.getName(),book.getAuthor(),book.getBookId()};
        return jdbcTemplate.update(sql,args);

        /*当批量修改时-batchUpdate
        * String sql = "update t_book set username=?,ustatus=? where user_id=?";
        * int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        * */
    }

    @Override
    public Book queryOne(int id) {
        String sql = "select * from book where book_id=?";
        return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<Book>(Book.class),id);
        /*如果是查询统计，返回的是一个值-queryForObject
        *
        * String sql = "select count(*) from t_book";
          Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        * */

        /*如果要返回多行-query
        * String sql = "select * from t_book"; //调用方法
        * List<Book> bookList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        *
        * */
    }
}
