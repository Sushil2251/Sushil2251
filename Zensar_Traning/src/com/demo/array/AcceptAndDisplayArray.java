package com.demo.array;

import java.util.Scanner;

public class AcceptAndDisplayArray {

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
		

	}

}

