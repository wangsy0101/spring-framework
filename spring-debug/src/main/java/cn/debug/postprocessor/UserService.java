package cn.debug.postprocessor;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Component
public class UserService implements InitializingBean, UserInterface {

	private User user;


	@Autowired
	public void setUser(User user){
		System.out.println("setUser 注入 user");
		this.user = user;
	}

	@PostConstruct
	public void setXXX(){
		System.out.println("post construct");
	}


	public void print(){
		System.out.println(this);
		System.out.println(this.user);
	}



	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean 初始化");
	}

	public void test() {
		System.out.println("执行业务逻辑");
	}
}
