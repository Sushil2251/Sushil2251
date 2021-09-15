package com.demo.array;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int size = sc.nextInt();
		int[] a = new int[size];
		int[] b=new int[size];
		System.out.println("Enter Array Elements : ");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			b[i]=a[i];
		}
		System.out.println("Array A");
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nArray A copied Into B");
		for(int i=0;i<size;i++)
		{
			System.out.println(b[i]+" ");
		}
	}

}

