package com.pc.advice;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

import com.pc.beans.Calculator;

public class PointCutAdvice extends StaticMethodMatcherPointcut{
  boolean flage=false;
	@Override
	public boolean matches(Method method, Class<?> classType) {
 
		if(classType.isAssignableFrom(Calculator.class) && method.getName().equals("add"))
		{
			System.out.println("pc");
			flage=true;
		}
		return flage;
	}

}
