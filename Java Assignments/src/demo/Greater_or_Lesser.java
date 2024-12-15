package com.demo;

public class Greater_or_Lesser
{
	public static void main(String[] args)
	{
		int first = 400;
		int second = 200;
		int third = 300;
		
		if((first > second) && (third < first))
		{
			System.out.println("Greatest value : "+ first);
		}
		else if((second > third) && (first < second))
		{
			System.out.println("Greatest value : "+ second);
		}
		else
		{
			System.out.println("Greatest value : "+ third);
		}
	}
}