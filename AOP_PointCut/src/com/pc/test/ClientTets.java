package com.pc.test;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

import com.aa.advice.LoginAdvice;
import com.pc.advice.PointCutAdvice;
import com.pc.beans.Calculator;

public class ClientTets {
	public static void main(String[] args) {
		ProxyFactory pf=new ProxyFactory();
		pf.setTarget(new Calculator());
		//pf.addAdvice(new LoginAdvice());
		DefaultPointcutAdvisor dpa=new DefaultPointcutAdvisor(new PointCutAdvice(),new LoginAdvice());
		pf.addAdvisor(dpa);
Calculator calculator=(Calculator) pf.getProxy();
  System.out.println("this comming from proxyClass:"+calculator.add(20, 30));
  System.out.println("=====================================================");
  System.out.println("this comming from proxyClass:"+calculator.sub(30,40));
	}

}
