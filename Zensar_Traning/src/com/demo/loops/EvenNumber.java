package com.demo.loops;

import java.util.Scanner;
public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int start = sc.nextInt();
		int end = sc.nextInt();
		for(int i=start;i<=end;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+"  is Even");
			}
		}

	}

}


