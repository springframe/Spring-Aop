package com.aa.aspect;

import java.lang.reflect.Method;

public class ExceptionLogerAdvice {
	
	public void afterThrowing(Exception e) {
		System.out.println("generic error : " + e.getMessage());
	}

	public void afterThrowing(Method method, Object[] args, Object target,
			IllegalArgumentException e) {
		System.out.println("method : " + method.getName()
				+ " has reported exception with message : " + e.getMessage());
	}

	public void afterThrowing(IllegalArgumentException iae) {
		System.out.println("exception : " + iae.getMessage());
	}

}
