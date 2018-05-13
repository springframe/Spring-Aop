package com.aa.beans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("kg")
public class KeyGenerator {

	public int generateKey(int size)
	{
		Random random=new Random();
		random.setSeed(size);
		int key=random.nextInt();
		return key;
		
	}
}
