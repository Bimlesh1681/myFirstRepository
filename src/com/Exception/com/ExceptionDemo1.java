package com.Exception.com;

public class ExceptionDemo1 {

	public static void main(String[] args) {

		String result = getGrade(85);
		System.out.println(result);

	}

	public static String getGrade(int marks) {
		if (marks >= 91 && marks <= 100) {
			return "Grade A";
		} else if (marks >= 80 && marks <= 90) {
			try {
				int i = 10 / 0;
				System.out.println(i);
			} catch (Exception e) {
				e.printStackTrace();
				return "Grade B";

			} 
		} else {
			System.out.println("Incorrect marks entered");
			return null;
		}
		
		return null;
	}
}
