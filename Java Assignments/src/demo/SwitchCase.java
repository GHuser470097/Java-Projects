package com.demo;

public class SwitchCase
{
	public static void main(String[] args)
	{
		int sub1 = 60;
		int sub2 = 58;
		int sub3 = 40;
		int sub4 = 75;
		int sub5 = 49;
		
	    int total = sub1+sub2+sub3+sub4+sub5;
		System.out.println("Total : "+ total);
		double percent = (total/5.0);
		System.out.println("Percent : "+ percent);
		
		
		int result;
		
		if(percent >= 80)
		{
			result =1;
		}
		else
		{
			if(percent >= 60)
			{
				result=2;
			}
			else
			{
				if(percent >= 40)
				result =3;
				else
				result =4;	
			}
		}	
		
		
    	switch(result)
		{
		
		case 1 : { System.out.println("Passed with I divion");  break;  }
		case 2 : { System.out.println("Passed with II divion");  break;  }
		case 3 : { System.out.println("Passed with III divion");  break;  }
		case 4 : {System.out.println("Failed..!!");  break;  }
		}
	}
}