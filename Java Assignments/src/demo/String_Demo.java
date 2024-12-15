package com.demo;

public class String_Demo
{

	public static void main(String[] args)
	{
        String language1 = "MongoDB";             // declare string
		String language2 = "Hypertext Markup Language";
		System.out.println("Language1  :  "+language1);
		System.out.println("Language2  :  "+language2);
		String language3 = new String();       //second way
		language3 = "NodeJScript";
		String language4  = new String("Javascript");
		System.out.println("Language3  :  "+language3);
		System.out.println("Language4  :  "+language4);
	}
}