package com.dp.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.support.DynamicMethodMatcherPointcut;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

import com.aa.beans.IntrAmtCalculater;

public class DynamicPointCut extends DynamicMethodMatcherPointcut{
  boolean flage=false;

@Override
public boolean matches(Method method, Class<?> classtype, Object[] args) {
if(classtype.isAssignableFrom(IntrAmtCalculater.class)&& method.getName().equals("intrAmtCal")&& (Float)args[0]>5000)
{
	flage=true;
}
	
	return flage;
}
  
	
}
