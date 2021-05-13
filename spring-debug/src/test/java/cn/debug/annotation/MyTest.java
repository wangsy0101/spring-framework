package cn.debug.annotation;

import cn.debug.annotation.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest {


    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation_applicationContext.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.getName());
    }
}
