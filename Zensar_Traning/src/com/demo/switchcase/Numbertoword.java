package com.demo.switchcase;

import java.util.*;
public class Numbertoword 
{
	public static void main(String args[])
	{
		int number;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter number---> ");
		number=num.nextInt();
		switch(number)
		{
		case 1 :
			System.out.println(number+" in word is ONE");
			break;
		case 2 :
			System.out.println(number+" in word is TWO");
			break;
		case 3 :
			System.out.println(number+" in word is THREE");
			break;
		case 4 :
			System.out.println(number+" in word is FOUR");
			break;
		case 5 :
			System.out.println(number+" in word is FIVE");
			break;
		default:
			System.out.println(number+" is a invalid number!!!!");
		
		}
	}
}
