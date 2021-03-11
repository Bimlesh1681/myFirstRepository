package Programs;

public class SwapNumbers {

	public static void main(String[] args) {
		
		swapNumbers(5, 2);

	}
	
	public static void swapNumbers(int a, int b)
	{
		int temp=0;
		
		temp=b;
		
		b=a;
		
		a=temp;
		
		System.out.println("New values are: "+a+" "+b);
	}

}
