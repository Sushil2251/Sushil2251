package com.demo.switchcase;

import java.util.*;
public class Weekdays 
{
	public static void main(String args[])
	{
		int number;
		Scanner w =new Scanner(System.in);
		System.out.print("Enter the number--> ");
		number=w.nextInt();
		switch(number)
		
		{
		case 1:
			System.out.println("Day of the week is SUNDAY ");
			break;
		case 2:
			System.out.println("Day of the week is MONDAY ");
			break;
		case 3:
			System.out.println("Day of the week is TUESDAY ");
			break;
		case 4:
			System.out.println("Day of the week is WEDNESDAY");
			break;
		case 5:
			System.out.println("Day of the week is THUSDAY");
			break;
		case 6:
			System.out.println("Day of the week is FRIDAY ");
			break;
		case 7:
			System.out.println("Day of the week is SATURDAY ");
			break;
		default:
			System.out.println("ERROR, DAY DOES NOT EXIST!!!!!!!");
				
		}
		
		
   }
}
