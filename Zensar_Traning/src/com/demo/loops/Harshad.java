package com.demo.loops;

import java.util.Scanner;

public class Harshad {
	Scanner sc = new Scanner(System.in);

	public void checker() {
		System.out.println("Enter Number : ");
		int number = sc.nextInt();
		int sum = 0, rem = 0;

		while (number > 0)
		{
			rem = number % 10;
			sum += rem;
			number = (int) (number / 10);
		}
		if (number % sum == 0)
		{
			System.out.println("The Number is a Harshad Number.");
		}
		else
		{
			System.out.println("Number is not a Harshad.");
		}
	}

	public static void main(String[] args) {
		Harshad h = new Harshad();
		h.checker();
	}

}

