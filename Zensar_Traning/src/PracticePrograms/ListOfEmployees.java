package PracticePrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
public class ListOfEmployees {

	
	public void display(ArrayList<Employee> l)
	{
		System.out.println("Using for loop .....");
		/*for(int i=0;i<l.size();i++)
		{
			Employee e = l.get(i);
			System.out.println(e);//e.toString();
		}*/
		/*System.out.println("Using for each.....");
		for(Employee e : l)
		{
			System.out.println(e);
			if(e.empName.equals("Vaishnavi"))
					l.remove(e);
		}*/
			System.out.println("Using Iterator ....");
			Iterator<Employee> itr = l.iterator();
			while(itr.hasNext())
			{
			Employee eo = itr.next();
			System.out.println(eo);
			}
			Collections.sort(l);
			
			System.out.println("Using Iterator after sorting ....");
		     itr = l.iterator();
			while(itr.hasNext())
			{
			Employee eo = itr.next();
			System.out.println(eo);
			}
			
		/*	System.out.println("Using List Iterator ....");
			ListIterator<Employee> litr = l.listIterator(l.size());
			while(litr.hasPrevious())
			{
				Employee e = litr.previous();
				System.out.println(e);
			}*/
	}
}