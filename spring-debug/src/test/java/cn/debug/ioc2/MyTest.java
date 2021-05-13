package cn.debug.ioc2;

import cn.debug.ioc2.entity.User;
import cn.debug.ioc2.entity.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc2_applicationContext.xml");
        User user = (User) context.getBean("user");
        user.show();

        UserT userT = (UserT) context.getBean("userT3");
        userT.show();
    }
}
