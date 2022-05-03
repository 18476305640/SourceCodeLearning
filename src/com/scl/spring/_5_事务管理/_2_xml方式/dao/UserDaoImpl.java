package com.scl.spring._5_事务管理._2_xml方式.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public int setMoneyByName(String name, int money) {
        String sql = "update user set money=? where name=?";
        Object[] args = {money,name};
        return jdbcTemplate.update(sql, args);
    }
}
