package com.aa.test;

import org.springframework.aop.framework.ProxyFactory;

import com.aa.advice.AroundAdvice;
import com.aa.advice.CacheAdvice;
import com.aa.beans.IntrAmtCalculater;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class ClientTest {
	public static void main(String[] args) {
		//create proxy Class
		ProxyFactory pf=new ProxyFactory();
		pf.setTarget(new IntrAmtCalculater());
		pf.addAdvice(new CacheAdvice());
	IntrAmtCalculater intamtcal=(IntrAmtCalculater) pf.getProxy();
	System.out.println("simple Intrest Amount-->"+intamtcal.intrAmtCal(5000,10,3));
	System.out.println("simple Intrest Amount-->"+intamtcal.intrAmtCal(5000,10,3));
	System.out.println("===============================================");
	System.out.println("Simple rate-->"+intamtcal.rateCal(5000,1500,3));
	
	System.out.println("===============================================");
	System.out.println("time-->"+intamtcal.timeCal(5000,1500,10));
	System.out.println("===============================================");
	System.out.println("Principle Amount-->"+intamtcal.principleCal(10,1500,3));
	System.out.println("===============================================");
	
	}

}
