package com.demo.switchcase;

import java.util.*;
public class Daysinmonth 
{
	public static void main(String args [])
	{
		int month;
		Scanner m = new Scanner(System.in);
		System.out.println("Enter the number of month--> ");
		month=m.nextInt();
		switch(month)
		{
		case 1 :
			System.out.println("IT IS JANUARY AND IT HAVE 31 DAYS");
			break;
		case 2 :
			System.out.println("IT IS FEBRUARY AND IT HAVE 28 DAYS");
			break;
		case 3 :
			System.out.println("IT IS MARCH AND IT HAVE 31 DAYS");
			break;
		case 4 :
			System.out.println("IT IS APRIL AND IT HAVE 30 DAYS");
			break;
		case 5 :
			System.out.println("IT IS MAY AND IT HAVE 31 DAYS");
			break;
		case 6 :
			System.out.println("IT IS JUNE AND IT HAVE 30 DAYS");
			break;
		case 7 :
			System.out.println("IT IS JYLY AND IT HAVE 31 DAYS");
			break;
		case 8 :
			System.out.println("IT IS AUGUST AND IT HAVE 31 DAYS");
			break;
		case 9 :
			System.out.println("IT IS SEPTEMBER AND IT HAVE 30 DAYS");
			break;
		case 10 :
			System.out.println("IT IS OCTOBER AND IT HAVE 31 DAYS");
			break;
		case 11 :
			System.out.println("IT IS NOVEMBER AND IT HAVE 30 DAYS");
			break;
		case 12 :
			System.out.println("IT IS DECEMBER AND IT HAVE 31 DAYS");
			break;
		default:
			System.out.println("INVAILD ENTRY!!!!!!!!!!!!");
		}
		
	}
}
