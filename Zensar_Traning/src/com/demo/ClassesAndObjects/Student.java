package com.demo.ClassesAndObjects;

/*4.	Create a class Student with 4 variables called as 
rollNo, admissionNo, age, courseId.Each of the variables should have one of the access modifier - public, protected,
no-access-modifier and private.Add 4 methods in the class – public, method doPublic, no access modifier method doDefault,
protected method doProtected, private method doPrivate.
In main method outside the class but in same package – create object of type Student.*/

public class Student 
{
	private int rollno;
	protected int addmissionno;
	int age;
	public int courseId;
	
	public void doPublic()
	{
		System.out.println("doPublic method");
	}
	void doDefault()
	{
		System.out.println("doDefault method");
	}
	protected void doProtected()
	{
		System.out.println("doProtected method");
	}
	private void doPrivate()
	{
		System.out.println("doPrivate method");
	}
}

