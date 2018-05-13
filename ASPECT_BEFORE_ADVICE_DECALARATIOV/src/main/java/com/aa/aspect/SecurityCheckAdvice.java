package com.aa.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

import com.aa.util.SecurityHolder;

public class SecurityCheckAdvice {
public Object securitCheckAdvice(ProceedingJoinPoint pjp) throws Throwable
{
	if (SecurityHolder.getInsatnace().authenticate() == false) 
	{
		throw new IllegalArgumentException("invalid user/pwd");
	}
	Object ret=pjp.proceed();
	return ret;
	
}
}
