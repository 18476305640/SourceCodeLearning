package com.scl.spring._5_事务管理._2_xml方式.service;

import com.scl.spring._5_事务管理._2_xml方式.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public void transfer() {
        int transferMoney = 100;
        userDao.setMoneyByName("lucy", 1000 - transferMoney);
        int i = 10/0;
        userDao.setMoneyByName("mary", 1000 + transferMoney);
        System.out.println("转账完成~");
    }
}
