package com.demo.Inheritance;
/*    4.Create interface Cake with a method declared as bake. 
Create 2 classes 
Strawberry, BlackForest both implementing Cake interface.
*/
public interface Cake {
	 
	public void bake();

}
class Strawberry implements Cake
{
	/* (non-Javadoc)
	 * @see com.demo.Inheritance.Cake#bake()
	 */
	public void bake()
	{
		System.out.println("Strawberry cake has Baked");
	}
}
class BlackForest implements Cake
{
	public void bake()
	{
		System.out.println("BlackForest cake has Baked");
	}
	
}
class Interface
{
	public static void main(String[] args) {
		Cake i;
		i=new BlackForest();
		i.bake();
		i=new Strawberry();
		i.bake();
	}
}
