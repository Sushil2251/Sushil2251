package com.demo.switchcase;

import java.util.*;
public class Calculater 
{
	public static void main(String args[])
	{
		char operation;
		int num1, num2, result ;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Choose an operation :" );
		System.out.println("1.Addition ");
		System.out.println("2.Substraction ");
		System.out.println("3.Multiplication ");
		System.out.println("4.Division ");
		System.out.println("5.Exit ");
		operation=input.next().charAt(0);
		
		System.out.print("Enter 1st number:  ");
		num1=input.nextInt();
		System.out.print("Enter 1st number:  ");
		num2=input.nextInt();
		
		switch(operation)
		{
		case '1' :
			result=num1+num2;
			System.out.println("Additon is--> "+result);
			break;
		case '2' :
			result=num1-num2;
			System.out.println("Substraction is--> "+result);
			break;
		case '3' :
			result=num1*num2;
			System.out.println("Multiplication is--> "+result);
			break;
		case '4' :
			result=num1/num2;
			System.out.println("Division is--> "+result);
			break;
		case '5' :
			System.out.println("Exit!!!!!! ");
			break;
			default:
				System.out.println("Invaild operation!!!!!! ");
				break;
		}
		
	}
}
