package cn.debug.proxy;

import cn.debug.proxy.demo01.Host;
import cn.debug.proxy.demo01.Proxy;
import cn.debug.proxy.demo02.UserServiceImpl;
import cn.debug.proxy.demo02.UserServiceProxy;
import cn.debug.proxy.demo03.CglibProxy;
import cn.debug.proxy.demo03.Rent;
import cn.debug.proxy.demo04.ProxyInvocationHandler;
import cn.debug.proxy.demo04.UserService;
import org.junit.Test;


public class MyTest {


	@Test
	public void testDemo01(){
		Host host = new Host();
		Proxy proxy = new Proxy(host);
		proxy.rent();
	}



	@Test
	public void testDemo02(){
		UserServiceImpl userService = new UserServiceImpl();

		UserServiceProxy proxy = new UserServiceProxy();
		proxy.setUserService(userService);
		proxy.add();
	}


	@Test
	public void testDemo03(){
//        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");

//        // jdk 动态代理
//        Host host = new Host();
//        ProxyInvocationHandler pih = new ProxyInvocationHandler();
//        pih.setRent(host);
//        Rent jdkProxy = (Rent) pih.getProxy();
//        jdkProxy.rent();

		System.out.println("=============================");

//        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "target/cglib");
		//cglib 动态代理
		CglibProxy cp = new CglibProxy();
		Rent cglibProxy = (cn.debug.proxy.demo03.Host) cp.getProxy(cn.debug.proxy.demo03.Host.class);
		cglibProxy.rent();
	}


	@Test
	public void testDemo04(){
		UserService userService = new cn.debug.proxy.demo04.UserServiceImpl();

		ProxyInvocationHandler pih = new ProxyInvocationHandler();
		pih.setTarget(userService);

		UserService proxy = (UserService) pih.getProxy();
		proxy.add();
		proxy.delete();
		proxy.update();
		proxy.query();
	}



}
