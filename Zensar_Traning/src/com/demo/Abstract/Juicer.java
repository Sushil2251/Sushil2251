package com.demo.Abstract;

public class Juicer extends Machine{
    
    public void rush(){
        System.out.println("Juicer.rush()");
    }
    public void filer(){
         System.out.println("Juicer.filer()");
     }
     
  
    public static void main(String[] args) {
    	Juicer j=new Juicer();
    	j.rush();
    	j.filer();
    	j.rotate();
    	
     Machine m=new Juicer();     //over ride method can call,machine method can call 
    m.rush();                        //juicer can't.
    m.rotate();
    //m.filer();
}
}

