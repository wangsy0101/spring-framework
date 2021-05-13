package cn.debug.circledependency2.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


@Component
@Aspect
//@EnableAspectJAutoProxy
public class B2AspectAdvice {


	@Around("execution(* cn.debug.circledependency2.CircleClassB2.test(..))")
	public Object test(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("B2切面前...");
		Object result = pjp.proceed();
		System.out.println("B2切面后...");
		return result;
	}



}
