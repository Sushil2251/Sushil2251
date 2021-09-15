package PracticePrograms;
import java.util.Scanner;

public class Employee implements Comparable<Employee>
{
	int empid;
	String empName;
	float salary;
	public Employee()
	{}
	public Employee(int id,String n,float s)
	{
		empid=id;
		empName = n;
		salary = s;
	}
	public int compareTo(Employee o)
	{
		if(this.salary<o.salary)
			return 1;
		else if(this.salary>o.salary)
			return -1;
		else 
		{
			 return o.empid-this.empid;
		}
	}
	public String toString()
	{
		return "Id : " + empid + " Name : " + empName + "Salary :"+salary;
	}
}

