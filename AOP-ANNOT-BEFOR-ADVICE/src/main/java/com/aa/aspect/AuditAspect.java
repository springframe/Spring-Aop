package com.aa.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuditAspect {

	@Before("within(com.aa.beans.*)")
	public void audit(JoinPoint jp)
	{
		System.out.println("johan call=:"+jp.getSignature().getName());
	}
}
