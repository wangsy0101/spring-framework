package cn.debug.aop2.service;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component
public class UserService2 {

	private String name2;


	@Transactional
	public String test(){
		System.out.println(this.getClass().getName());
		return "hello";
	}
}





