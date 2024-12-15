package com.demo;

public class Greatest_Forloop
{
	public static void main(String[] args)
	{
        int[] numbers = {50, 100, 300, 600};
        int greatest = numbers[0]; 
        for (int i = 1; i < numbers.length; i++)
        {
            if (numbers[i] > greatest)
            {
                greatest = numbers[i]; 
            }
        }
        System.out.println("Greatest value is: " + greatest);
    }
}