package com.revision.java;

import java.util.ArrayList;

public class ArrayListAssignment {

	public static void main(String[] args) {
		

//ArrayList is a class in Java
//ArrayList is a dynamic array (not fixed length)
		

		ArrayList<String> country = new ArrayList<String>();
		
		country.add("India");
		country.add("America");
		country.add("Belgium");
		country.add("Germany");
		country.add("Canada");
		country.add("Australia");
		
		//print the size of the arraylist
		
		//System.out.println(country.size());//6
		
		//retrieve a particular element from the arrayList
		
		//System.out.println(country.get(3));//Germany
		
		//insert an element at the first and last position
		
		//country.add(0,"Japan");
		//country.add(7,"Africa");
		
		//System.out.println(country);
		
		//update a specific array element by given element
		
		//country.set(7, "Brazil");
		//System.out.println(country);
		
		//remove an element from the arrayList
		
		//country.remove(4);
		//System.out.println(country);
		
		//reverse elements from the arrayList
		
		
		 // for(int i=country.size()-1;i>=0;i--) { System.out.println(country.get(i)); }
		 
		//extract a portion from the arrayList - 5th index will not be included
		
		//System.out.println(country.subList(3, 5));
		
		//empty the arrayList
		
		//country.removeAll(country);
		//System.out.println(country);
		
		//swap two elements from the arrayList
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Tom");
		names.add("Jerry");
		
		System.out.println("Before swap "+names);
		
		String temp = names.get(0);
		names.set(0, names.get(1));
		names.set(1, temp);
		
		System.out.println("After sway "+names);
		
	}

}
