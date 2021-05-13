package cn.debug.circledependency;

import org.springframework.stereotype.Component;


@Component
public class CircleClassB {


	private CircleClassC circleClassC;


	public CircleClassB(CircleClassC circleClassC) {
		System.out.println(this.getClass().getName() + "的构造方法");
		this.circleClassC = circleClassC;
	}

	public void test(){
		System.out.println(this.getClass().getName() + " dependency: " + circleClassC);
	}

}
