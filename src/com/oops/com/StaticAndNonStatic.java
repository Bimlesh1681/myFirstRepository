package com.oops.com;

public class StaticAndNonStatic {

	public void login()
	{
		System.out.println("Login");
		homePage();
		title();
		header();
		footer();
		//m1();
	}
	
	public void homePage()
	{
		System.out.println("HomePage");
		
	}
	
	public void title()
	{
		System.out.println("title");
	}
	
	public void header()
	{
		System.out.println("Header");
	}

	public void footer()
	{
		System.out.println("Footer");
	}
	
	public static void main(String[] args) {
	
		m1();

	}
	
	public static void m1()
	{
		System.out.println("Static method m1");
		m2();
		m3();
		new StaticAndNonStatic().login();
	}
	
	public static void m2()
	{
		System.out.println("Static method m2");
	}

	public static void m3()
	{
		System.out.println("Static method m3");
	}
}
