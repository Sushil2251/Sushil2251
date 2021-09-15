package com.demo.loops;
import java.util.Scanner;

public class Palindrome {
	Scanner sc=new Scanner(System.in);
	public void checker()
	{
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		int sum = 0, rem = 0;
		int number=num;
		while(number!=0)
		{
			rem=number%10;
			sum=(sum*10)+rem;
			number=number/10;
		}
		if (num==sum)
		{
			System.out.println("the Number is a palindrome .");
		}
		else
			System.out.println("the Number is not a palindrome .");

	}
	public static void main(String[] args) {
		Palindrome p=new Palindrome();
		p.checker();
	}

}
