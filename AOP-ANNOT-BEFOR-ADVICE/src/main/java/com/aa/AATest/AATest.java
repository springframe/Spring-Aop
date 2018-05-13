package com.aa.AATest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.aa.beans.LoanManager;

public class AATest {
	public static void main(String[] args) {
		//create ioc container
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/aa/commams/application-context.xml");
	    LoanManager loanManager=ac.getBean("lm",LoanManager.class);
	    System.out.println(loanManager.approveLoan(101));
		
	}

}
