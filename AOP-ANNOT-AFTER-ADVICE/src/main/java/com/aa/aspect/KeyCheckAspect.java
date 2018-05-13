package com.aa.aspect;

import java.util.Random;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class KeyCheckAspect 
{
	@Pointcut("com.aa.beans.*.*(..)")
	public void commonPointcut() {
	}

	@AfterThrowing(value = "commonPointcut()", throwing = "ret")
	public void validateKey(JoinPoint jp, Object ret) {
		if ((Integer) ret <= 0) {
			throw new IllegalArgumentException("weak key");
		}
	}
	@AfterThrowing(value = "commonPointcut()", throwing = "iae")
	public void logException(JoinPoint jp, IllegalArgumentException iae) {
		System.out.println("exception : " + iae.getMessage());
	}

}
