package com.demo.ClassesAndObjects;
//3. Create one class Employee (id , name, salary) with private access modifier and create getter and setter
public class Employee 
{
	private int eid;
	private String ename;
	private int esalary;
	public int getEid() {
		return eid;
	}
	public void setEid(int id) {
		eid = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String name) {
		ename = name;
	}
	public int getSalary() {
		return esalary;
	}
	public void setSalary(int salary) {
		esalary = salary;
	}
	
}
