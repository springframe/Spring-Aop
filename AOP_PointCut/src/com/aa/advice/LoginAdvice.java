package com.aa.advice;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoginAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable 
	{
		String methodName=null;
		Object[] arg=null;
		Object ret=null;
		methodName=methodInvocation.getMethod().getName();
		System.out.println("in invoke for method="+methodName);
		arg=methodInvocation.getArguments();
		System.out.println("this is arg inside the method="+Arrays.toString(arg));
		ret=methodInvocation.proceed();
		return (ret;
	}

}
