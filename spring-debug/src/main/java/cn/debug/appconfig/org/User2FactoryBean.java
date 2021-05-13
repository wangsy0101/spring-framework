package cn.debug.appconfig.org;

import cn.debug.appconfig.pojo.User2;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;


@Component("user2")
public class User2FactoryBean implements FactoryBean {

    public Object getObject() throws Exception {
        return new User2();
    }

    public Class<?> getObjectType() {
        return User2.class;
    }
}
