package com.aa.AATest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aa.beans.IntrAmtCal;

public class AAATest {
	public static void main(String[] args) {
		//craete ioc container
		ApplicationContext ap=new ClassPathXmlApplicationContext("com/aa/commams/application-context.xml");
		IntrAmtCal ic = ap.getBean("intrAmtCal",IntrAmtCal.class);
		System.out.println(ic.intrAmtCal(45000.43f, 2.3f, 10.5f));
		System.out.println("---------------------");
		System.out.println(ic.intrAmtCal(45000.43f, 2.3f, 10.5f));
		System.out.println(ic.principleCal(10, 1500, 2));
	}

}
