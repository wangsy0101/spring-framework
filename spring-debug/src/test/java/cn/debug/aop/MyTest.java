package cn.debug.aop;

import cn.debug.aop.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MyTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop_applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.query();


    }
}
