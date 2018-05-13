package com.ara.test;

import org.springframework.aop.framework.ProxyFactory;

import com.ara.aspect.ExceptionLogerAdvice;

import com.ara.beans.Thrower;

public class ARATest {
	public static void main(String[] args) {
		//craete ProxyFactory bean
		ProxyFactory pfactory=new ProxyFactory();
		pfactory.setTarget(new Thrower());
		pfactory.addAdvice(new ExceptionLogerAdvice());
	Thrower kgenerator=(Thrower)pfactory.getProxy();
	 int key=kgenerator.willThrow(9);
	System.out.println("key=>"+key);
	}

}
