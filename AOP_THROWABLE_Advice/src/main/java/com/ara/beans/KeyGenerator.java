package com.ara.beans;

import java.util.Random;

public class KeyGenerator {
public int generatorKey(int size)
{
	Random random=new Random(size);
	random.setSeed(5);
	int key=random.nextInt();
	return key;
	
}
	
}
