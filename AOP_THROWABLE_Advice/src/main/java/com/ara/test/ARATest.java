package com.ara.test;

import org.springframework.aop.framework.ProxyFactory;

import com.ara.aspect.KeyCheckAdvice;
import com.ara.beans.KeyGenerator;

public class ARATest {
	public static void main(String[] args) {
		//craete ProxyFactory bean
		ProxyFactory pfactory=new ProxyFactory();
		pfactory.setTarget(new KeyGenerator());
		pfactory.addAdvice(new KeyCheckAdvice());
	KeyGenerator kgenerator=(KeyGenerator)pfactory.getProxy();
	int key=kgenerator.generatorKey(5);
	System.out.println("key=>"+key);
	}

}
