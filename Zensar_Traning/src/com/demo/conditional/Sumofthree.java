package com.demo.conditional;

import java.util.*;
public class Sumofthree 
{
	public static void main(String args[])
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number --> ");
		num=sc.nextInt();
		if(num>99 && num<1000)
		{
			System.out.println("It is a Three digit number....!!");
			
		}
		else
		{
			System.out.println("It is NOT a Three digit number....!!");
		}
		
	}
}