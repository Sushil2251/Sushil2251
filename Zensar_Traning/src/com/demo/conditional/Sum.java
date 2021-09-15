package com.demo.conditional;

import java.util.Scanner;

public class Sum
{
	public static void main (String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int no = sc.nextInt();
	int summ=0;
	for(summ=0;no!=0;no/=10) {
		summ+=no%10;
		
	}
	
	
	
	
	
	System.out.println(summ);

}
	}