package com.demo.conditional;

import java.util.Scanner;


public class Vowelandconsonant 
{
	public static void main(String args[])
	{
		System.out.println("Enter the character : ");
		Scanner sc =new Scanner(System.in);
		char ch =sc.next().charAt(0);
		if(ch == 'a' || ch == 'e' || ch == 'o'  || ch =='u' || ch == 'i')
		{
			System.out.println("Given character is an vowel");
		
		}
		else
		{
			System.out.println("Given character is an consonant");
		}
	}
	
}
