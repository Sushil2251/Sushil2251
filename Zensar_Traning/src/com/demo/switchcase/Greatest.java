package com.demo.switchcase;

import java.util.*;
public class Greatest 
{
	public static void main(String args[])
	{
		int num1, num2, num3;
		Scanner n = new Scanner(System.in);
		System.out.print("Enter numbers to be compared-->  ");
		num1=n.nextInt();
		num2=n.nextInt();
		num3 = num1> num2 ?1:0;
		/*if(num1 > num2)
		{
			num3= 1;
			
		}
		else if(num2 > num1) 
		{
			num3=0;
		}
		
		else
		{
			num3=2;
		}*/
		switch(num3)
		{
		case 1:
			System.out.println(num1+" is greater then "+num2);
			break;
		case 2 :
			System.out.println("Both Numbers are same");
			break;
		case 0:	
			System.out.println(num2+" is greater then "+num1);
			break;
		}
	}
}
   
