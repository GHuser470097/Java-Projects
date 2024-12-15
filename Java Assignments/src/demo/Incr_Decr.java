package com.demo;

public class Incr_Decr
{
	public static void main(String[] args)
	{
		int data = 100;
		
		System.out.println(++data);                      // pre increment operator
		System.out.println(data++);                      // post increment operator
		System.out.println(--data);                     // pre decrement operator
		System.out.println(data--);                     // post decrement operator
	}
}