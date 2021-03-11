package com.java.basics;

public class StringComparision {

	public static void main(String[] args) {
		
		badCode1();
		badCode2();
				
	}

	public static void badCode1()
	{
		String browser = "Chrome";
		
		if(browser.equals("Chrome"))
		{
			System.out.println("Browser selected is Chrome");
		}
		
		if(browser.equals("Firefox"))
		{
			System.out.println("Browser selected is Firefox");
		}
		
		if(browser.equals("IE11"))
		{
			System.out.println("Browser selected is IE11");
		}
		
		if(browser.equals("Safari"))
		{
			System.out.println("Browser selected is Safari");
		}
	}
	
	public static void badCode2()
	{
		String browser = "Firefox";
		
		if(browser.equals("Chrome"))
		{
			System.out.println("Browser selected is Chrome");
		}
		
		else if(browser.equals("Firefox"))
		{
			System.out.println("Browser selected is Firefox");
		}
		
		else if(browser.equals("IE11"))
		{
			System.out.println("Browser selected is IE11");
		}
		
		else if(browser.equals("Safari"))
		{
			System.out.println("Browser selected is Safari");
		}
		
		else
		{
			System.out.println("Incorrect browser is selected");
		}
	}
	
}
