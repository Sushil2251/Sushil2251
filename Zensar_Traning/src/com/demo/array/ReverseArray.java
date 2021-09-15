package com.demo.array;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int size = sc.nextInt();
		int[] a = new int[size];
		int[] b =new int[size];
		System.out.println("Enter Array Elements : ");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array A");
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nReverse Array A");
		for(int i=size-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}


	}

}
