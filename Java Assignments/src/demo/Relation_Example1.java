package com.demo;

public class Relation_Example1
{
	public static void main(String []args)
	{
		int f=50;
		int s=50;
		boolean less=(f<s);
		System.out.println("First less than second: "+less);
		boolean greater=(f>s);
		System.out.println("First greater than second: "+greater);
		boolean equals=(f==s);
		System.out.println("First equals second: "+equals);
		boolean Gequal=(f>=s);
		System.out.println("First Greater than equals second: "+Gequal);
		boolean Lequal=(f<=s);
		System.out.println("First Less than equals second: "+Lequal);
		boolean Nequal=(f!=s);
		System.out.println("First not equals second: "+Nequal);
	}
}