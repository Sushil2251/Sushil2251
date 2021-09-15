package com.demo.Inheritance;

public class Pen 
{
	
	public int capLength;
	public String brand;
	public void setCaplength(int capLength)
	{
		this.capLength=capLength;
	}
	public int getCaplength()
	{
		return capLength;
	}
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	public String getBrand()
	{
		return brand;
	}
	public void show()
	{
		System.out.println("Cap Length : "+getCaplength());
		System.out.println("Brand : "+getBrand());
	}
	
}
class Refill
{
	String inkColor;
	int length;
	public void setInkColor(String inkColor)
	{
		this.inkColor=inkColor;
	}
	public String getInkcolor()
	{
		return inkColor;
	}
	public void setLength(int length)
	{
		this.length=length;
	}
	public int getLength()
	{
		return length;
	}
	public void show()
	{
		System.out.println("Ink Color : "+getInkcolor());
		System.out.println("Length Of Refill : "+getLength());
	}
}
class Nib
{
	String materialType;
	int width;
	public void setMaterialType(String materialType)
	{
		this.materialType=materialType;
	}
	public String getMaterialType()
	{
		return materialType;
	}
	public void setWidth(int width)
	{
		this.width=width;
	}
	public int getWidth()
	{
		return width;
	}
	public void show()
	{
		System.out.println("Material Type : "+getMaterialType());
		System.out.println("Width of Nib : "+getWidth());
	
	}
}
class AllSetsAndGets
{
	public static void main(String[] args)
	{
		Pen p=new Pen();
		p.setCaplength(5);
		p.setBrand("Boll Pen");
		p.show();
		Refill r=new Refill();
		r.setInkColor("Blue");
		r.setLength(25);
		r.show();
		Nib n=new Nib();
		n.setMaterialType("Plastic");
		n.setWidth(2);
		n.show();
		
	}
}

/* 2.	A Pen contains variables Refill r, int capLength and  String brand. 
	Refill has variables inkColor, length and Nib (tip).
	 Nib has variables materialType and width. 
	Create a Java class structure for above . 
Write a main method which sets values in all the variables
using setter methods and prints all the variables using getter methods. 

*/