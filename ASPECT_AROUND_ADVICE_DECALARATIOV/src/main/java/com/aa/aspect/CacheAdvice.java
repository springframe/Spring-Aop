package com.aa.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

import com.aa.util.Cache;

public class CacheAdvice {
	
	public Object myCacheAdvice(ProceedingJoinPoint pjp) throws Throwable
	{
		
		String methodName=pjp.getSignature().getName();
		Object[] args=pjp.getArgs();
		String key=null;
		Object ret=null;
		Cache cache=Cache.getInstance();
		 key= methodName+"("+args[0]+","+args[1]+")";
		 System.out.println(key);
		if(cache.containsKey(key)==true)
		{
			 /*key=(String)cache.get(key);*/
			 return cache.get(key);
		}
		else
		{
		ret=pjp.proceed();
	   cache.put(key, ret);
		}
		return ret;
		
	}

}
