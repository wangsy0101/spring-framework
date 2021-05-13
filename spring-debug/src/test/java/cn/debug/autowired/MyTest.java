package cn.debug.autowired;

import cn.debug.autowired.entity.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest {

    @Test
    public void test1 (){
        ApplicationContext context = new ClassPathXmlApplicationContext("autowired_beans.xml");
        People people = context.getBean("people", People.class);
        people.getCat().shout();
        people.getDog().shout();
    }
}
