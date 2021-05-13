package cn.debug.aop2.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


@Component
@Aspect
@EnableAspectJAutoProxy
public class AspectAdvice {


	@Around("execution(* cn.debug.aop2.service.UserService.test(..))")
	public Object test(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("切面前...");
		Object result = pjp.proceed();
		System.out.println("切面后...");
		return result;
	}



}
