package com.scl.spring._5_事务管理._1_注解方式._1_普通方式.service;

import com.scl.spring._5_事务管理._1_注解方式._1_普通方式.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
//开启事务的注解，可以放在类上（作用于所有方法）。也可以直接放在方法上
@Transactional
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
