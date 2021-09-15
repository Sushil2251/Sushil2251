package com.demo.loops;

import java.util.Scanner;
public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int number = sc.nextInt();
		int prod = 1, rem = 0;
		int num=number;
		while(num!=0)
		{
			rem=num%10;
			prod=prod*rem;
			num=num/10;
		}
		System.out.println("Product of digit of number "+number+" = "+prod);

	}

}
