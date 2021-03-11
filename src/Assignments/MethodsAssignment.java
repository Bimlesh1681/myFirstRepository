package Assignments;

public class MethodsAssignment {

	public int sum(int num1, int num2)
	{
		System.out.println("Printing the sum of two numbers");
		int result = num1+num2;
		return result;
	}
	
	public int prodNumbers(int num1, int num2)
	{
		System.out.println("Printing the product of two numbers");
		int result = num1*num2;
		return result;
	}
	
	public double printCircumference(int radius)
	{
		System.out.println("Printing the circumference of the circle");
		double circum = 2*3.14*radius;
		return circum;
	}
	
	public double calcCircleArea(int radius)
	{
		System.out.println("Printing the area of the circle");
		double area = 3.14*radius*radius;
		return area;
	}
	
	public void findMaximum(int num1, int num2, int num3)
	{
		if(num1>num2 && num1>num3)
		{
			System.out.println(num1+" is the greatest of the three numbers");
		}
		else if(num2>num3)
		{
			System.out.println(num2+" is the greatest of the three numbers");
		}
		else
		{
			System.out.println(num3+" is the greatest of the three numbers");
		}
		
	}
	
	public boolean evenOrOdd(int num)
	{
		if(num%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isEligible(int age)
	{
		if(age>=18)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String displayMarks(int marks)
	{
		String grade = null;
		
		if(marks>=91 && marks<=100)
		{
			return grade="AA";
		}
		else if(marks>=81 && marks<=90)
		{
			return grade="AB";
		}
		else if(marks>=71 && marks<=80)
		{
			return grade="BB";
		}
		else
		{
			return grade="Fail";
		}
	}
	public static void main(String[] args) {
		
		MethodsAssignment obj = new MethodsAssignment();
		
		//System.out.println(obj.sum(900, 5));
		//System.out.println(obj.prodNumbers(5, 8));
		//System.out.println(obj.printCircumference(5));
		//System.out.println(obj.calcCircleArea(5));
		//obj.findMaximum(900, 1, 10000);
		//System.out.println(obj.evenOrOdd(5));
		//System.out.println(obj.isEligible(17));
		
		System.out.println(obj.displayMarks(65));
	}

}
