package com.demo.basics;
import java.util.Scanner; 
public class Main
{
	public static void main (String args[])
	{
	Scanner sc=new Scanner (System.in);
	int index=sc.nextInt();
	int num=1;
for(int i=0;i<index;i++)
{
	num+=i;
}
	System.out.println(num);
}
}