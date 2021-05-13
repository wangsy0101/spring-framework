package cn.debug.circledependency2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
public class CircleClassA2 {


	@Autowired
	private CircleClassB2 circleClassB2;


	public void test(){
		System.out.println(this.getClass().getName() + " dependency: " + circleClassB2);
	}
}



