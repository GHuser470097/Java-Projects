package com.inheritance;

public class Area
{
	  double myarea;
	
	  public void calculatearea(int radius)
	  {
		  double area = 3.14*radius*radius;
		  myarea = area;
		 // System.out.println("Area of circle : "+area);
	  }
	  
	  public void printarea()
	  {
	  System.out.println("circle Area : "+ myarea);
	  }
}