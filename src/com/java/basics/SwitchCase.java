package com.java.basics;

public class SwitchCase {

	public static void main(String[] args) {
		
		printWeekday(5);
		selBrowser("hello");

}
	
	public static void printWeekday(int num)
	{
		switch(num)
		{
		case 1:
			System.out.println("Monday");
			break;
				
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wednesday");
			break;
			
		case 4:
			System.out.println("Thursday");
			break;
		
		case 5:
			System.out.println("Friday");
			break;
			
		case 6:
			System.out.println("Saturday");
			break;
		
		case 7:
			System.out.println("Sunday");
			break;
		}

	}
	
	public static void selBrowser(String browser)
	{
		switch(browser)
		{
		case "chrome":
			System.out.println("Browser selected is "+browser);
			break;
		
		case "firefox":
			System.out.println("Browser selected is "+browser);
			break;
			
		case "safari":
			System.out.println("Browser selected is "+browser);
			break;
			
			default:
				System.out.println("Incorrect browser is selected");
				break;
		}
	}
}