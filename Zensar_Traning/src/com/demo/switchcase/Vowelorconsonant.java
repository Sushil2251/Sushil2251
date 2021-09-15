package com.demo.switchcase;

import java.util.*;
public class Vowelorconsonant 
{
	public static void main(String args[])
	{
		
		Scanner l = new Scanner(System.in);
		System.out.print("Enter the Letter--> ");
		char letter=l.next().charAt(0);
		switch(letter)
		{
		case 'A':
			System.out.println(letter+" is a VOWEL");
			break;
		case 'E':
			System.out.println(letter+" is a VOWEL");
			break;
		case 'I':
			System.out.println(letter+" is a VOWEL");
			break;
		case 'O':
			System.out.println(letter+" is a VOWEL");
			break;
		case 'U':
			System.out.println(letter+" is a VOWEL");
			break;
		case 'a':
			System.out.println(letter+" is a VOWEL");
			break;
		case 'e':
			System.out.println(letter+" is a VOWEL");
			break;
		case 'i':
			System.out.println(letter+" is a VOWEL");
			break;
		case 'o':
			System.out.println(letter+" is a VOWEL");
			break;
		case 'u':
			System.out.println(letter+" is a VOWEL");
			break;
		default:
			System.out.println(letter+" is a CONSONANT");
		}
	}
}
