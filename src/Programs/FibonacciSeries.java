package Programs;

public class FibonacciSeries {

	//is a series where the next number is the sum of first two numbers
	//0 1 1 2 3 5 8 13 21
	
	public static void main(String[] args) {
		printFibonacciSeries(10);

	}

	public static void printFibonacciSeries(int number)
	{
		int a = 0;
		int b = 1;
		int c = 0;
		
		System.out.print(a+" "+b+" ");
		for(int i=0;i<=number;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
	}
}
