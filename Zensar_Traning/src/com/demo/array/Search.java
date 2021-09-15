package com.demo.array;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter Array Elements : ");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Display Array Elements : ");
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nEnter Search Element :");
		int search=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(search==a[i])
			{
				i=i+1;
				System.out.println("\nSearch Element Is Available at index position "+i);
			}
			
		}
		

	}

}

