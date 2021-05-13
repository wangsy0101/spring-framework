package cn.debug.aop.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;


public class LogAfter implements AfterReturningAdvice {


    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("返回值为 " + returnValue);
    }
}
