package cn.debug.circledependency;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component
public class CircleClassA {

	private CircleClassB circleClassB;


	@Lazy   // @Lazy注解解决构造器的循环依赖
	public CircleClassA(CircleClassB circleClassB){
		System.out.println(this.getClass().getName() + "的构造方法");
		this.circleClassB = circleClassB;
	}


	public void test(){
		System.out.println(this.getClass().getName() + " dependency: " + circleClassB);
	}
}
