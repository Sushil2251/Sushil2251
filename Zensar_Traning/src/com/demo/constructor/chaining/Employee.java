package com.demo.constructor.chaining;

public class Employee {
	public String empName;
	public int empSalary;
	public String address;
	
	public Employee() {
		this("Balaji");
		System.out.println("defult construtor called.....");
	}

	public Employee(String empName ) {
		this(empName, 34345);
	
		System.out.println("single paramter construtor called....."+ empName);
		
	}
	
	
	public Employee(String empName, int empSalary) {
		this(empName, empSalary, "pune");
		System.out.println("two paramter construtor called.....");
		
	}


	public Employee(String empName, int empSalary, String address) {
		this.empName = empName;
		this.empSalary = empSalary;
		this.address = address;
		System.out.println("three paramter construtor called.....");
	}
	


	void display() {
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Salary: " + empSalary);
		System.out.println("Employee Address: " + address);
	}

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.display();
	}
}

