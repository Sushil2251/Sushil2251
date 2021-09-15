package com.demo.ArrayList;

public class Customer implements Comparable<Customer>
{
	int cid;
	String cname;
	int cage;
	
	public Customer(int id, String n, int a) 
	{
		cid=id;
		cname=n;
		cage=a;
	}
	public int compareTo(Customer c4)
	{
		if(this.cage<c4.cage)
		{
			return -1;
		}
		else if(this.cage>c4.cage)
		{
			return 1;
		}
		else
		{
			return 0;
		}
		
			
	}
	public String toString()
	{
		return "id: " +cid+ " Name: "+cname+ " Age : "+cage ;
	}
	
}
 