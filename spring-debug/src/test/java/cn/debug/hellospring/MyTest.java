package cn.debug.hellospring;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest {


    public static void main(String[] args) {
        //声明式
        ApplicationContext ac1 = new ClassPathXmlApplicationContext("hellospring_beans.xml");
        Hello hello = (Hello) ac1.getBean("hello");
        System.out.println(hello.toString());

        //编程式
        AnnotationConfigApplicationContext ac2 = new AnnotationConfigApplicationContext();
        AbstractBeanDefinition beanDefinition2 = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
        beanDefinition2.setBeanClass(Hello2.class);
        ac2.registerBeanDefinition("hello2", beanDefinition2);
        ac2.refresh();
        System.out.println(ac2.getBean("hello2"));


        // FactoryBean
        AnnotationConfigApplicationContext ac3 = new AnnotationConfigApplicationContext();
        AbstractBeanDefinition beanDefinition3 = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
        beanDefinition3.setBeanClass(Hello3FactoryBean.class);
        ac3.registerBeanDefinition("hello3", beanDefinition3);
        ac3.refresh();

        System.out.println(ac3.getBean("hello3"));
        System.out.println(ac3.getBean("&hello3"));



    }
}
