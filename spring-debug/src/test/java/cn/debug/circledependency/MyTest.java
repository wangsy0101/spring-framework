package cn.debug.circledependency;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MyTest {





	@Test
	public void testCircle(){
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(cn.debug.circledependency.config.Config.class);
		CircleClassA circleClassA = ac.getBean("circleClassA", CircleClassA.class);
		CircleClassB circleClassB = ac.getBean("circleClassB", CircleClassB.class);
		CircleClassC circleClassC = ac.getBean("circleClassC", CircleClassC.class);

		circleClassA.test();
		circleClassB.test();
		circleClassC.test();

	}





}
