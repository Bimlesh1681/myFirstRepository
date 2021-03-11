package Assignments;

public class BatmanLoop {

	public static void main(String[] args) {
	
		/*
		 * for(int i=1;i<=9;i++) { System.out.println("I am Batman "+i); }
		 */
		//WAP to print 10 to 1 using for, while and do-while loop

		//int num=10;
		/*
		 * while(num>=1) { System.out.println(num); num=num-1; }
		 */
		
		/*
		 * do { System.out.println(num); num--; }while(num>=1);
		 */
		
		//Write a program in Java to print "Hello World" ten times using while loop
		
		/*
		 * int num=1;
		 * 
		 * while(num<=10) { System.out.println("Hello World"); num++; }
		 */

		//Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered
		
		/*
		 * int num=1; while(num<=10) { System.out.println(num); if(num%7==0) {
		 * System.out.println(num+" is divisible by 7"); break; } num++; }
		 */
		
		/*
		 * int num=4;
		 * 
		 * while(num>=0) { System.out.println("n = "+num); num--; }
		 */
		
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=9;j++)
			{
				System.out.print(i+""+j+" ");
			}System.out.println();
		}
	}

}
