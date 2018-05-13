package com.ba.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

import com.ba.commans.SecurityHolder;

public class SecurityCheckAdvice implements MethodBeforeAdvice
{

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		
		
		// if authentication failure, stop allowing to approve by throwing
				// exception
				if (SecurityHolder.getInstance().authenticate() == false) {
					throw new IllegalAccessException("invalid un/pwd");
				}
		
	}

}
