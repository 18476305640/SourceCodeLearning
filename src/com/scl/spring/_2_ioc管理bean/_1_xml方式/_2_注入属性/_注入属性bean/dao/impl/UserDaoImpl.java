package com.scl.spring._2_ioc管理bean._1_xml方式._2_注入属性._注入属性bean.dao.impl;

import com.scl.spring._2_ioc管理bean._1_xml方式._2_注入属性._注入属性bean.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public boolean insert() {
        System.out.println("UserDao add...");
        return true;
    }
}
