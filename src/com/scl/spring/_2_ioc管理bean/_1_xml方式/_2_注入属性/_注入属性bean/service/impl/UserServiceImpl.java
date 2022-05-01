package com.scl.spring._2_ioc管理bean._1_xml方式._2_注入属性._注入属性bean.service.impl;

import com.scl.spring._2_ioc管理bean._1_xml方式._2_注入属性._注入属性bean.dao.UserDao;
import com.scl.spring._2_ioc管理bean._1_xml方式._2_注入属性._注入属性bean.service.UserService;

public class UserServiceImpl implements UserService {
    public UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean insert() {
        System.out.println("UserService add ....");
        userDao.insert();
        return true;
    }
}
