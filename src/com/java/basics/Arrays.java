package com.java.basics;

public class Arrays {

	public static void main(String[] args) {
		
		int numbers[] = new int[3];
		
		numbers[0] = 100;
		numbers[1] = 200;
		numbers[2] = 500;
		
		//Lowest Index = 0
		//Highest Index = 2
		System.out.println("The length of the array is "+numbers.length);
		
		//System.out.println(numbers[1]+numbers[2]);
		
		//System.out.println(numbers);
		
		//fetch all the values from the array
		
		/*
		 * for(int i=0;i<numbers.length;i++) { System.out.println(numbers[i]); }
		 * 
		 * for(int num: numbers) { System.out.println(num); }
		 */
		double d[] = new double[2];
		
		double d1[] = {10.01,20.02};
		
		char ch[] = new char[3];
		
		ch[0] = 'A';
		ch[1] = 'B';
		ch[2] = '6';
		
		String emp[] = new String[4];
		
		emp[0] = "Bimesh";
		emp[1] = "M";
		emp[2] = "QA Manager";
		emp[3] = "True";
		
		for(int i=0;i<emp.length;i++)
		{
			System.out.println(emp[i]);
		}
	}

}
