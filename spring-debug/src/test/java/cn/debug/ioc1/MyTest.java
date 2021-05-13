package cn.debug.ioc1;

import cn.debug.ioc1.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc1_beans.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.getUser();
    }

}
