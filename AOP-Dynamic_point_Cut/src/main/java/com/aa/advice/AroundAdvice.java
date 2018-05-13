package com.aa.advice;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvice implements MethodInterceptor
{

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		String methodName=null;
		Object[] arg=null;
		Object ret=null;
       methodName=methodInvocation.getMethod().getName();
       System.out.println("invocation Method Name->"+methodName);
       arg=methodInvocation.getArguments();
   	// perform logging before target class method executes
		System.out.print("entered into " + methodName + "(");
		for (int i = 0; i < arg.length; i++) {
			if (i == 0) {
				System.out.print(arg[i]);
				continue;
			}
			System.out.print("," + arg[i]);
		}
		System.out.println(")");
		
       System.out.println("the argument in side the method is->"+Arrays.toString(arg));
       //call target class
       ret=methodInvocation.proceed();
		
		return ret;
	}

}
