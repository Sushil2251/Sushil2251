package com.demo.loops;

import java.util.Scanner;
public class PalindromeBetween {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int start = sc.nextInt();
		int end = sc.nextInt();
		int sum = 0, rem = 0;
		
		for(int i=start;i<=end;i++)
		{
			int number=i;
			while (number != 0)
			{
				rem = number % 10;
				sum = (sum * 10) + rem;
				number = number / 10;
			}
			if (i == sum)
			{
				System.out.println(i+"");
			}
			
		}
	}

}

