package com.demo.conditional;

import java.util.Scanner;

public class BiggestNumber 
{
	public static void main(String[] args)
	{
		int Num1, Num2, Num3;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the 1st number = ");
		Num1 = s.nextInt(); 
		System.out.println("Enter the 2st number = ");
		Num2 = s.nextInt(); 
		System.out.println("Enter the 3st number = ");
		Num3 = s.nextInt(); 
		if(Num1 > Num2 && Num1 > Num3)
        {
            System.out.println("Largest number is:"+Num1);
        }
        else if(Num2 > Num3)
        {
            System.out.println("Largest number is:"+Num2);
        }
        else
        {
            System.out.println("Largest number is:"+Num3);
        }
	}
	
}
