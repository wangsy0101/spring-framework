package cn.debug.circledependency;

import org.springframework.stereotype.Component;


@Component
public class CircleClassC {


	private CircleClassA circleClassA;

	public CircleClassC(CircleClassA circleClassA) {
		System.out.println(this.getClass().getName() + "的构造方法");
		this.circleClassA = circleClassA;
	}

	public void test(){
		System.out.println(this.getClass().getName() + " dependency: " + circleClassA);
	}

}
