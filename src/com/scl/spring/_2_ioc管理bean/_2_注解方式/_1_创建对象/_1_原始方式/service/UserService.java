package com.scl.spring._2_ioc管理bean._2_注解方式._1_创建对象._1_原始方式.service;

import org.springframework.stereotype.Service;

/**
 * （1）@Component
 * （2）@Service
 * （3）@Controller
 * （4）@Repository
 * * 上面四个注解功能是一样的，都可以用来创建bean实例
 */
@Service(value = "userService") //value默认就是类的首字符小写
public class UserService {
    public void insert() {
        System.out.println("xml+注解 service add ..");
    }
}
