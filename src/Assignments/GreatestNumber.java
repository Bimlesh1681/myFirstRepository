package Assignments;

public class GreatestNumber {

	public static void main(String[] args) {
		
		printMaximum(25.11,91.90,87);
		
	}

	public static void printMaximum(double num1, double num2, double num3)
	{
		if(num1>num2 && num1>num3)
		{
			System.out.println("The greatest of 3 numbers is "+num1);
		}
		else if(num2>num3)
		{
			System.out.println("The greatest of 3 numbers is "+num2);
		}
		else
		{
			System.out.println("The greatest of 3 numbers is "+num3);
		}
	}
}
