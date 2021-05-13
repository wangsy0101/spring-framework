package cn.debug.proxy.demo03;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 *
 * Cglib 动态代理
 *
 * MethodInterceptor
 */
public class CglibProxy implements MethodInterceptor {


    public Object getProxy(Class<?> clazz){
        Enhancer enhancer = new Enhancer();
        //要代理的类即为这里的父类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }



    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        seeHouse();
        Object result = methodProxy.invokeSuper(o, objects);
        fare();
        return result;
    }



    public void seeHouse(){
        System.out.println("中介带看房子");
    }

    public void fare(){
        System.out.println("中介收中介费");
    }
}


