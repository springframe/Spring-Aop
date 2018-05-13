package com.ba.test;

import org.springframework.aop.framework.ProxyFactory;

import com.ba.aspect.LoanManager;
import com.ba.aspect.SecurityCheckAdvice;
import com.ba.commans.SecurityHolder;

public class BATest {
	public static void main(String[] args) {
		ProxyFactory pfactory=new ProxyFactory();
		pfactory.setTarget(new LoanManager());
		pfactory.addAdvice(new SecurityCheckAdvice());
		SecurityHolder sholder=SecurityHolder.getInstance();
		sholder.login("john","welcome1");
		LoanManager proxy = (LoanManager) pfactory.getProxy();
		System.out.println("approved : ? " + proxy.approveLoan(2));
		sholder.logout();
	}

}
