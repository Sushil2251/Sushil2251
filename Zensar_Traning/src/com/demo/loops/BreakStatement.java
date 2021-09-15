package com.demo.loops;
import java.util.Scanner;


public class BreakStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0;i<5;i++)
		{
			if(i==3)
			{
				break;
			}
			System.out.println("Statement Break done"+i);
		}
}

}
