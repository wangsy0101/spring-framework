package cn.debug.aop.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class AnnotationPointCut {

    @Before("execution( * cn.debug.aop.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("方法执行前");
    }


    @After("execution( * cn.debug.aop.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("方法执行后");
    }


    @Around("execution( * cn.debug.aop.service.UserServiceImpl.*(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前");
        Object object = joinPoint.proceed();
        System.out.println("环绕后");
        return object;
    }




}
