package com.demo.loops;

import java.util.Scanner;
public class Automorphic {
	Scanner sc=new Scanner(System.in);
	public void checker()
	{
		System.out.println("Enter Number : ");
		int number=sc.nextInt();
		int n1=number*number;
		int n2=n1%10;
		if(n2==number)
		{
			System.out.println("Number is a Automorphic.");
		}
		else
			System.out.println("Number is not a Automorphic.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automorphic a=new Automorphic();
		a.checker();
		
	}

}
