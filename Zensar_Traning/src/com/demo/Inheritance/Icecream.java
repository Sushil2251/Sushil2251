package com.demo.Inheritance;


/*Create interface IceCream with method eat and Juice with method drink, 
Create class Mastani which implements both interfaces. */
public interface Icecream {
	public void eat();

}
interface Juice
{
	public void drink();
}
class Mastani implements Icecream,Juice
{
	public void eat()
	{
		System.out.println("Do you Have IceCream ?");
	}
	public void drink()
	{
		System.out.println("Do You Want juice ?");
	}
	
	public static void main(String[] args) {
		Mastani m=new Mastani();
		m.eat();
		m.drink();
	}
}



