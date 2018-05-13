package com.ara.beans;

import java.util.Random;

public class Thrower {
public int willThrow(int i)
{
	if(i<0)
	{
		throw new IllegalArgumentException("invalid paramter --"+i);
	}
	return i+10;
}
}
