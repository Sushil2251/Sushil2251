package com.demo.ClassesAndObjects;

/*Write Java Program to Find Area of Square, Rectangle, and Circle using Method Overloading*/
public class AreaOf 
{
void area(float r)
{
	System.out.println("Area Of Circle:"+3.14f*r*r);
}
void area(int s)
{
	System.out.println("Area of a square:"+s*s);
}
void area(int l,int w)
{
    System.out.println("Area of a rectangle"+l*w);
}
public static void main(String[] args) 
{
	AreaOf a =new AreaOf();
	a.area(5.2f);
	a.area(7);
	a.area(12,8);
}

}

