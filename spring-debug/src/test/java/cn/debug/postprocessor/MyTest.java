package cn.debug.postprocessor;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MyTest {


	@Test
	public void testPostProcessor(){
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(cn.debug.postprocessor.config.Config.class);
		UserInterface proxy = (UserInterface) ac.getBean("userService");
		proxy.test();
	}





}
