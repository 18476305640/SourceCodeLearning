package com.scl.spring._2_ioc管理bean._1_xml方式._1_创建对象._3_创建FactoryBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * _创建FactoryBean对象与创建普通对象最大的不同，就是创建的对象与返回的对象不同，
 *  在xml中我们写的是MyBean类，按常理我们是返回MyBean对象的，但其实我们返回的是String，返回什么是与我们继承MyBean时重写getObject方法有关（也是FactoryBean指定的泛型），其返回值类型就是String
 * <bean name="myBean" class="com.scl.spring._2_ioc管理bean._1_xml方式._1_创建对象._创建FactoryBean.MyBean">
 * </bean>
 */
public class main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/scl/spring/_2_ioc管理bean/_1_xml方式/_1_创建对象/_3_创建FactoryBean/_创建FactoryBean.xml");
        String MyBean = context.getBean("myBean", String.class);
        System.out.println(MyBean);

    }
}
