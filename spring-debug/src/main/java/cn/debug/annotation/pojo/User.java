package cn.debug.annotation.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



// 组件注解，等价于 <bean id="user" class="cn.debug.annotation.pojo.User"/>
@Component
public class User {


    // 赋值注解 等价于 <property name="name" value="wangsy"/>
    @Value("wangsy")
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
