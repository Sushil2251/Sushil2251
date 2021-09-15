package com.demo.conditional;

import java.util.*;
public class Empsalary 
{
	public static void main(String args[])
	{
		float basic_salary,grosspay;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the baic Salary of Employee :  ");
		basic_salary=scan.nextFloat();
		{
		if (basic_salary<=10000)
			{
				float HRA=20;
				float DA=80;
				HRA =(HRA*basic_salary)/100;
				DA =(DA*basic_salary)/100;
				grosspay = basic_salary + DA + HRA ;
				System.out.println("Gross salary of the Employee is : "+grosspay);
			}
		else if (basic_salary>10000 && basic_salary<=20000)
			{
				float HRA=25;
				float DA=90;
				HRA =(HRA*basic_salary)/100;
				DA =(DA*basic_salary)/100;
				grosspay = basic_salary + DA + HRA ;
				System.out.println("Gross salary of the Employee is : "+grosspay);
			}
			else
			{
				float HRA=30;
				float DA=95;
				HRA =(HRA*basic_salary)/100;
				DA =(DA*basic_salary)/100;
				grosspay = basic_salary + DA + HRA ;
				System.out.println("Gross salary of the Employee is : "+grosspay);
			}
		}	
	}
		
		
}

