package com.aa.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class keyCheckAdvice {
	public void checkAdvice(JoinPoint jp, int generatedKey) throws Throwable {
		
	
		if(generatedKey<=5)
		{
			throw new IllegalArgumentException("plz give lager value");
		}
		
	}

}
