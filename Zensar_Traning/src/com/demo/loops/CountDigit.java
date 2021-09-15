package com.demo.loops;

import java.util.Scanner;
public class CountDigit {
	public void count()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number : ");
		int number = sc.nextInt();
		int count=0;
		while(number!=0)
		{
			int rem =number%10;
			count++;
			number=number/10;
		}
		System.out.println("Count : "+count);
	}
	public static void main(String[] args) {
		CountDigit c=new CountDigit();
		c.count();
	}

}
