package cn.debug.circledependency2;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MyTest {



	@Test
	public void testCircle2(){
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(cn.debug.circledependency2.config.Config.class);
		CircleClassA2 circleClassA2 = ac.getBean("circleClassA2", CircleClassA2.class);
		CircleClassB2 circleClassB2 = ac.getBean("circleClassB2", CircleClassB2.class);

		circleClassA2.test();
		circleClassB2.test();

	}



}
