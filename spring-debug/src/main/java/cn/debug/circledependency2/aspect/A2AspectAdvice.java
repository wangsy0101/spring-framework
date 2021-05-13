package cn.debug.circledependency2.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


@Component
@Aspect
//@EnableAspectJAutoProxy
public class A2AspectAdvice {


	@Around("execution(* cn.debug.circledependency2.CircleClassA2.test(..))")
	public Object test(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("A2切面前...");
		Object result = pjp.proceed();
		System.out.println("A2切面后...");
		return result;
	}



}
