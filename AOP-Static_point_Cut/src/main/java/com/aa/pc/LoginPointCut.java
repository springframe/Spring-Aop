package com.aa.pc;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

import com.aa.beans.IntrAmtCalculater;

public class LoginPointCut extends StaticMethodMatcherPointcut{
  boolean flage=false;
  
	@Override
	public boolean matches(Method method, Class<?> classType) 
	{
           if(classType.isAssignableFrom(IntrAmtCalculater.class) &&method.getName().equals("intrAmtCal"))
           {
        	   flage=true;
           }
           return flage;
	}
	
}
