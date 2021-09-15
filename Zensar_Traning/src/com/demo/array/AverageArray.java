package com.demo.array;

import java.util.Scanner;

public class AverageArray
{
	public static void main(String[] args) {
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
		int sum=0;
		for(int i=0;i<size;i++)
		{
			sum=sum+a[i];
		}
		int avg=sum/size;
		System.out.println("\nAverage of Array Elements : "+avg);

	}
}

