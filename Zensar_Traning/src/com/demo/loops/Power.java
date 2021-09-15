package com.demo.loops;

import java.util.*;
public class Power {
	Scanner sc=new Scanner(System.in);
	public void baseIndex()
	{
		System.out.println("Enter Following value : ");
		int base=sc.nextInt();
		int index=sc.nextInt();
		int result=1;
		for(int i=1;i<=index;i++)
		{
			
			result*=base;
		}
		System.out.println("Power : "+result);	
	}
	public static void main(String[] args) {
		Power p= new Power();
		p.baseIndex();
		
	}

}
