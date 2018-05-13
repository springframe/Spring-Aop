package com.ara.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class KeyCheckAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object retValue, Method method, Object[] args, Object target)
			throws Throwable {
 System.out.println(retValue);
		if((Integer)retValue<7)
{
	throw new IllegalArgumentException("Weak Key keyGenerator");
}
		
	}

}
