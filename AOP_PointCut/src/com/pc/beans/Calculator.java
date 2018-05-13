package com.pc.beans;

public class Calculator {
	int count=0;
	public int add(int a,int b)
	{
		count++;
		System.out.println("this is add(==) from target class");
		return a+b;
	}
	public int sub(int a,int b)
	{
		count++;
		System.out.println("this is sub(--)from target class");
		System.out.println(count);
		return a-b;
	}	

}
