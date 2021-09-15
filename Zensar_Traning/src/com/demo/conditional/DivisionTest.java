package com.demo.conditional;

import java.util.Scanner;

public class DivisionTest 
{
	private static Scanner sc;
	public static void main(String [] args)
	{
		int number ;
		sc = new Scanner(System.in);
		
		System.out.println("Enter the number to check wether it is divisible by 5 and 11 = ");
		number = sc.nextInt();
		
		if((number % 5 ==0) && (number % 11 == 0))
		{
			System.out.println("Given Number " +number+ " Is divisable by 5 as well as 11");
		}
		else
		{
			System.out.println("Given Number " +number+ " Is not divisable by 5 as well as 11");
		}
	}
	
}

