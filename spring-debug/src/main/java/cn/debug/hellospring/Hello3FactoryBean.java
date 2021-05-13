package cn.debug.hellospring;

import org.springframework.beans.factory.FactoryBean;


public class Hello3FactoryBean implements FactoryBean {


    public Object getObject() throws Exception {
        return new Hello3();
    }

    public Class<?> getObjectType() {
        return Hello3.class;
    }
}
