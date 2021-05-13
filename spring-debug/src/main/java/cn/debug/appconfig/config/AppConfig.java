package cn.debug.appconfig.config;

import cn.debug.appconfig.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;



// 这个注解的类也会交给spring托管，注册到容器中，因为它本身也是一个@Component
// @Configuration 代表了一个配置类，等价于之前的 applicationContext.xml
@Configuration
@Import(AppConfig2.class)
@ComponentScan("cn.debug.appconfig")
public class AppConfig {



    @Bean("user")
    public User getUser(){
        User user = new User();
        user.setName("wangsy");
        return user;
    }
}
