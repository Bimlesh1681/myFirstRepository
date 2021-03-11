package com.Exception.com;

public class ExceptionDemo {

	static String text;
	
	public static void main(String[] args) {

		System.out.println("Hi...");

		//Arithematic Exception
		/*
		 * try { int i = 10 / 0; System.out.println("The value of i is: " + i); } catch
		 * (Exception e) { System.out.println("Exception occured!!!");
		 * e.printStackTrace(); } finally {
		 * System.out.println("I am part of finally block"); }
		 */

		//array index out of bound exception
		
		/*
		 * int numbers[] = new int[2]; numbers[0] = 100; numbers[1] = 95; numbers[2] =
		 * 89;
		 * 
		 * System.out.println(numbers[3]);
		 */
		
		//String index out of bound exception
		
		/*
		 * String name = "Samsung Galaxy Note 9"; System.out.println(name.length());
		 * System.out.println(name.charAt(20));
		 */
		
		//Null pointer exception
		
		try{
			String text=null;
			System.out.println(text.length());
		}catch(Exception e)
		{
			System.out.println("Some exception occured");
			e.printStackTrace();
		}finally
		{
			System.out.println("I am part of finally block");
		}
		System.out.println("After finally block");
		
	}

}
