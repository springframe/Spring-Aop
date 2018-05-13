package com.aa.AATest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aa.beans.Thrower;



public class AAATest {
	public static void main(String[] args) {
		//craete ioc container
		ApplicationContext ap=new ClassPathXmlApplicationContext("com/aa/commams/application-context.xml");
           Thrower thr=ap.getBean("tha",Thrower.class);
           System.out.println(thr.willThrow(10));
	}

}
