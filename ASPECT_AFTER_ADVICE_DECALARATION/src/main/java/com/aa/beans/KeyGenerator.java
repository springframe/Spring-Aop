package com.aa.beans;

import java.util.Random;

public class KeyGenerator {

	public int keyGenerator(int size)
	{
		Random random=new Random();
		random.setSeed(size);
		int key=random.nextInt();
		System.out.println(key);
		return key;
		
	}
}
