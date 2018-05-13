package com.aa.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoginAdvice 
{
	public Object myloginAdvice(ProceedingJoinPoint pjp) throws Throwable
	{
		String methodName=pjp.getSignature().getName();
		Object[] args=pjp.getArgs();
		System.out.println("enter into the method"+methodName+"("+args[0]+","+args[1]+")");
		Object ret=null;
	  ret=pjp.proceed();
	  
	  return (float)ret+1000;
	}
}
