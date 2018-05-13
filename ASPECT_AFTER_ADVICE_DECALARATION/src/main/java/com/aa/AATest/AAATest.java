package com.aa.AATest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aa.beans.KeyGenerator;


public class AAATest {
	public static void main(String[] args) {
		//craete ioc container
		ApplicationContext ap=new ClassPathXmlApplicationContext("com/aa/commams/application-context.xml");
      KeyGenerator kg=ap.getBean("keygenerator",KeyGenerator.class);
      System.out.println(kg.keyGenerator(9));
	}

}
