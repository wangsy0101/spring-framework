package cn.debug.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


@Component
public class TestInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {


	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		if (beanName.equals("userService")) {
			System.out.println("实例化前");
		}
		return null;
	}

	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		if (beanName.equals("userService")){
			System.out.println("实例化后");
		}
		return true;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("userService")) {
			System.out.println("初始化前");
		}
		return bean;
	}

	public Object postProcessAfterInitialization(final Object bean, String beanName) throws BeansException {
		if (beanName.equals("userService")) {
			System.out.println("初始化后: " + bean);

			// AOP
			Object proxy = Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(), new InvocationHandler() {
				public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
					System.out.println("执行代理逻辑1");
					method.invoke(bean, args);
					System.out.println("执行代理逻辑2");
					return proxy;
				}
			});
			return proxy;
		}

		return bean;
	}
}
