package com.hierarchy;

public class HierarchyDemo extends Area
{
	public static void main(String[] args)
	{
		Square sq = new Square();
		Rectangle re = new Rectangle();
		sq.squarearea(sq.s);
		re.rectanglearea(re.l, re.b);
	}
}