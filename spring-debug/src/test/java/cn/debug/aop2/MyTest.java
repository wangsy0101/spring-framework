package cn.debug.aop2;

import cn.debug.aop2.service.UserService;
import cn.debug.aop2.service.UserService2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MyTest {



	@Test
	public void testCircle2(){

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(cn.debug.aop2.config.Config.class);
		UserService userService = ac.getBean("userService", UserService.class);
		UserService2 userService2 = ac.getBean("userService2", UserService2.class);
		userService.test();
		userService2.test();

	}



}
