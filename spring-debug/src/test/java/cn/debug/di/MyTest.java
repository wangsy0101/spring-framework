package cn.debug.di;

import cn.debug.di.entity.Student;
import cn.debug.di.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest {


    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("di_applicationContext.xml");
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student.toString());
        System.out.println(student.getWife() == null);


        User user = (User) applicationContext.getBean("user");
        System.out.println(user.toString());


        User user2 = (User) applicationContext.getBean("user2");
        System.out.println(user2.toString());
    }


    @Test
    public void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("di_userBeans.xml");

        User user = (User) applicationContext.getBean("user");
        System.out.println(user.toString());
        User user2 = (User) applicationContext.getBean("user2");
        System.out.println(user2.toString());

    }


    @Test
    public void test3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("di_userBeans.xml");

        User userA = (User) applicationContext.getBean("user");
        User userB = (User) applicationContext.getBean("user");
        System.out.println(userA == userB);

        User user2A = (User) applicationContext.getBean("user2");
        User user2B = (User) applicationContext.getBean("user2");
        System.out.println(user2A == user2B);

    }
}
