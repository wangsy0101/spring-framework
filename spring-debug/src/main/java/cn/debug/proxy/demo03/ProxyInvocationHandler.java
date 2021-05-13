package cn.debug.proxy.demo03;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 * JDK 动态代理
 * InvocationHandler
 * Proxy
 */
public class ProxyInvocationHandler implements InvocationHandler {


    // 接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    // 生成代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        // 调用接口的方法，实际会调用这里的invoke方法，再通过反射去调真实类的实现方法
        Object result = method.invoke(rent, args);
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
