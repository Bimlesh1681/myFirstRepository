package com.java.basics;

public class ConditionalOperators {

	public static void main(String[] args) {

		//= Assignment
		//== Comparision
		//< less than
		//> greater than
		//<= less than equal to
		//>= greater than equal to
		//!= not equal to
		
		//WAP to find the greater of 4 number
		
		findGreater(100,900,300,1200);

	}
	
	public static void findGreater(int num1, int num2, int num3, int num4)
	{
			if(num1>num2 && num1>num3 && num1>num4)
			{
				System.out.println("The greatest of 4 numbers is "+num1);
			}
			
			else if(num2>num3 && num2>num4)
			{
				System.out.println("The greatest of 4 numbers is "+num2);
			}
			
			else if(num3>num4)
			{
				System.out.println("The greatest of 4 numbers is "+num3);
			}
			
			else
			{
				System.out.println("The greated of 4 numbers is "+num4);
			}
	}

	
}





