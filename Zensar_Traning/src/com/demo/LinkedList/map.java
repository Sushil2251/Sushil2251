package com.demo.LinkedList;

public class map {
	
}

	m.put(34, "Execution");

	m.put(523,"Maintainance");

	String str=m.put(34, "Accounts");

	System.out.println(str);

	System.out.println(m);

	//get all keys using keySet(

	Set<Integer> kset = m.keySet();

	System.out.println("Set of keys is:" + kset); 
	Iterator<Integer> itr = kset.iterator(); while(itr.hasNext())

	{

	Integer key = itr.next();

	String v= m.get(key);
}
