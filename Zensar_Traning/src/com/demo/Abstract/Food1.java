package com.demo.Abstract;

public class Food1 extends Food{

	 public void shareRecipie() {
		 System.out.println(" share the Recipie !");
	 }
		
	
	public void maharashtraFood() {
		System.out.println("Pav bhaji, vada pav");
	}
	
	
	
	public static void main(String[] args) {
		Food f=new Food1();
		f.panipuri();
		
	}

}
