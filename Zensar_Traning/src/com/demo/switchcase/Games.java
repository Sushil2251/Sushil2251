package com.demo.switchcase;

import java.util.*;
public class Games 
{
	public static void main(String args[])
	{
		String game;
		Scanner g= new Scanner(System.in);
		System.out.println("Enter the game--> ");
		game=g.next();
        switch(game)
        {  
	        case "Hockey":  
	            System.out.println("Let's play Hockey");  
	            break;  
	        case "cricket":  
	            System.out.println("Let's play Cricket");  
	            break;  
	        case "football":  
	            System.out.println("Let's play Football"); 
        }
	}
}

