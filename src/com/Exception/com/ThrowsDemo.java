package com.Exception.com;

public class ThrowsDemo {

	public void m1() throws Exception
	{
		System.out.println("I am m1 method");
		m2();
				
	}
	
	public void m2() throws Exception
	{
		System.out.println("I am m2 method");
		m3();
	}
	
	public void m3() throws Exception
	{
		System.out.println("I am m3 method");
		m4();
	}
	
	public void m4() throws Exception
	{
		System.out.println("I am m4 method");
		int i=10/0;
		System.out.println("The value of i is :"+i);
		
	}
	public static void main(String[] args) throws Exception {
		
	new ThrowsDemo().m1();

	}
	
	public static void test()
	{
		System.out.println("I am static method test");
		
	}

}
