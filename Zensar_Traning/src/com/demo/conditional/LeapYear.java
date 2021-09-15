package com.demo.conditional;

import java.util.Scanner;
public class LeapYear 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any year:");
        int year = s.nextInt();
        if(year % 400 == 0)
        {
        	System.out.println("Year "+year+" is a Leap Year");
        }
        else if (year % 100 == 0)
        {
        	System.out.println("Year "+year+" is a Leap Year");
        }
        else if(year % 4 == 0)
        {
        	System.out.println("Year "+year+" is a Leap Year");
        }
        else
        {
        	System.out.println("Year "+year+" is not a Leap Year");
        }
       
    }
}