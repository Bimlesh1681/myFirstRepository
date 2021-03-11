package com.java.basics;

public class StringConcatenation {

	public static void main(String[] args) {
		
		String x = "Hello";
		String y = "World";
		
		int a = 100;
		int b = 200;
		
		double d1 = 10.10;
		double d2 = 20.20;
		
		System.out.println(x+y+(a+b));
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b)+(d1+d2));

		System.out.println("-----------------------");
		
		//System.out.println(9/0);
		System.out.println(10%2);
		System.out.println(11%2);
		
		byte myByte = 065; //Octal number
		
		System.out.println("The value of myByte is: "+myByte);
		
	}

}
