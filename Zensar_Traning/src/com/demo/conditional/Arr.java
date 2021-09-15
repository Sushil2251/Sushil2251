package com.demo.conditional;

import java.util.Scanner;

public class Arr {
	
	
	    public static void main(String args[]) {
	    	Scanner sc = new Scanner(System.in);
	      // int count, max, min, i;
	        int a[] = new int[5];
	   
	       
	   
	       // System.out.println("Enter number of elements");
	       // count = in.nextInt();
	        //System.out.println("Enter " + count + " elements");
	         
	        for(int i = 0; i<a.length; i++) {
	            a[i] = sc.nextInt();
	        }
	   
	         int min = a[0];
	        for(int i = 1; i < a.length; i++) {
	        	if (a[i] < min)
	                min = a[i];
	        }
	        System.out.println(min);

	    }
}
	

