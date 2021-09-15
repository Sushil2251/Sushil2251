package com.demo.ClassesAndObjects;

public class Account1
{
	public long accountNo;
	public String customerName;
	Account1()
	{
		accountNo=123;
		customerName="Yash";
		System.out.println("I am in default constructor");
	}
	Account1(long l,String s)
	{
		accountNo=l;
		customerName=s;
		System.out.println("I am in parameterized constructor");
	}
	public static void main(String[] args)
	{
		Account1 a=new Account1();
		Account1 b=new Account1(2251,"Sammy");
	}

}

