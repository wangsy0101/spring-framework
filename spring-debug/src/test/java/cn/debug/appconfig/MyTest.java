package cn.debug.appconfig;

import cn.debug.appconfig.config.AppConfig;
import cn.debug.appconfig.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {


    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = context.getBean("user", User.class);
        System.out.println(user.getName());



        ApplicationContext context2 = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(context2.getBean("user2"));
        System.out.println(context2.getBean("&user2"));
    }
}
