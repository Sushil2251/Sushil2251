package com.demo.loops;

import java.util.Scanner;

public class SumOfEvenNumbers {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				sum+=i;
			}
		}
		System.out.println("Total even number sum:"+sum);
	}

}

