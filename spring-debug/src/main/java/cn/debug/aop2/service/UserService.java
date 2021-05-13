package cn.debug.aop2.service;

import org.springframework.stereotype.Component;


@Component
public class UserService {

	private String name;


	public void test(){
		System.out.println(this.getClass().getName());
	}
}
