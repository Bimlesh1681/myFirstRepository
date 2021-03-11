package com.revision.java;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str = "I am learning Java and Selenium in 2021 and Java";
		
		//length of the string
		
		System.out.println(str.length());//48
		
		//charAt - Prints the character at the specified index
		
		System.out.println(str.charAt(14));//j
		System.out.println(str.charAt(47));//string index out of bound exception
		
		//indexOf - Prints the index of the specified character or word
		
		System.out.println(str.indexOf('J'));//14
		System.out.println(str.indexOf("Java"));//14
		System.out.println(str.indexOf('E'));//-1
		
		//toLowerCase and toUpperCase
		
		System.out.println(str.toLowerCase());
		
		System.out.println(str.toUpperCase());
		
		//equals and equalsIgnoreCase
		
		String browser = "Chrome";
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.out.println("Browser pass");
		}
		else
		{
			System.out.println("Browser fail");
		}
		
		//contains
		
		if(str.contains("JAVA"))
		{
			System.out.println("contains Pass");
		}
		else
		{
			System.out.println("contains Fail");
		}
		
		//replace
		
		String date = "30-JAN-2021";
		System.out.println(date.replace("-", ":"));
		
		//Substring - extract a portion of the string
		
		String id = "Transaction id is 12344321";
		
		System.out.println(id.substring(id.indexOf("is")+3, id.length()));
		
		System.out.println(id.substring(id.indexOf("is")+3));
		
		String lang = "Java;Python;Ruby;C#";
		
		for(int i=0;i<lang.split(";").length;i++)
		{
			System.out.println(lang.split(";")[i]);
		}
		
		String data = "xXdata1xXdata2xXdata3xXdata4xXdata5";
		
		System.out.println(data.split("xX")[5]);
	}

}
