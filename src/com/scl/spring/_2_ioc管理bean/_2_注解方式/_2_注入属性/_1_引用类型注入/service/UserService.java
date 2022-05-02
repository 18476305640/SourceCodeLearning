package com.scl.spring._2_ioc管理bean._2_注解方式._2_注入属性._1_引用类型注入.service;

import com.scl.spring._2_ioc管理bean._2_注解方式._2_注入属性._1_引用类型注入.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userService") //value默认就是类的首字符小写
public class UserService {

    /**
     * （1）@Autowired：根据属性类型进行自动装配
     * （2）@Qualifier：根据名称进行注入
     * （3）@Resource
     *      @Resource //根据类型进行注入
     *      @Resource(name = "userDaoImpl1") //根据名称进行注入
     */
    @Autowired
    private UserDao userDao;
    public void insert() {
        System.out.println("service add ..");
        userDao.insert();
    }
}
