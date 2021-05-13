package cn.debug.circledependency2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class CircleClassB2 {


	@Autowired
	private CircleClassA2 circleClassA2;


	public void test(){
		System.out.println(this.getClass().getName() + " dependency: " + circleClassA2);
	}

}


