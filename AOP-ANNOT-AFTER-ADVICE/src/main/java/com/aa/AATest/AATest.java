package com.aa.AATest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aa.beans.Calculator;

public class AATest {
	public static void main(String[] args) {
		//create ioc container
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/aa/commams/application-context.xml");
		 Calculator cal=ac.getBean("calculator",Calculator.class);
		 System.out.println(cal.add(10,20));
		
	}

}
