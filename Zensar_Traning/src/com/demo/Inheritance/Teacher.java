package com.demo.Inheritance;

abstract public class Teacher {
	int Tid,MobileNo;
	String Tname;
	public Teacher(int id,String name,int mb_no)
	{
		Tid=id;
		Tname=name;
		MobileNo=mb_no;
	}
   abstract public void salary();
}

class Hourlybased extends Teacher
{
	int rate_per_hr,hrs ,salary;
	public Hourlybased(int id,String name,int mb_no,int rate,int hr)
	{
		  super(id,name,mb_no);
		  rate_per_hr=rate;
		  hrs=hr;
	}
    public void salary()
	{
		salary=rate_per_hr*hrs;
	}
    void show()
    {
    	System.out.println("Teacher id = "+super.Tid);
    	System.out.println("Teacher Name = "+super.Tname);
    	System.out.println("Teacher MobileNo = "+super.MobileNo);
    	System.out.println("Salary = "+salary);   
    }
}
class SalaryBased extends Teacher{
	int salary; 
	public SalaryBased(int id,String name,int mb_no,int sal)
	{
		super(id,name,mb_no);
		salary=sal;
	}

	public void salary()
	{
		System.out.println("Salary function of Salary Based Class = "+salary);
	}
	public static void main(String[] args) {
		Hourlybased h=new Hourlybased(001, "Abhijit", 90221212, 18, 5);
		h.salary();
		h.show();
		SalaryBased s= new SalaryBased(124,"efghi",36378257,50000);
		s.salary();
		
	}
}