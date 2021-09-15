package com.demo.loops;

import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int start = sc.nextInt();
		int end = sc.nextInt();
		int i=start;
		while(i<=end)
			//for(int i=start;i<=end;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");
			}
			i++;
		}

	}
}
