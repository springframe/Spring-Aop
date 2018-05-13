package com.aa.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoginAspect {
	@Around("execution( * com.aa.beans.*.* (..))")
public Object log(ProceedingJoinPoint pjp) throws Throwable
{
	
	System.out.println("Enter into the method:"+pjp.getSignature().getName());
	Object ret=pjp.proceed();
	System.out.println("exiting from;;"+pjp.getSignature().getName()+"with returning value=="
			+(Integer)ret);
	return pjp;
	
}
}
