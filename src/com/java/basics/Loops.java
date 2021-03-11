package com.java.basics;

public class Loops {

	public static void main(String[] args) {
		
		//print values from 1 to 10 using while and for loops
		
		/*
		 * int i=1;
		 * 
		 * while(i<=10) { System.out.println(i); i=i+1; }
		 * 
		 * for(int j=1;j<=10;j++) { System.out.println(j); }
		 */
		
		/*
		 * int num=1;
		 * 
		 * while(num<=50) { System.out.println(num); if(num%5==0) {
		 * System.out.println("is divisible by 5"); } num=num+1; }
		 */
		
		/*
		 * //print even values from 1 to 10
		 * 
		 * for(int i=1;i<=10;i++ ) { if(i%2==0) { System.out.println(i); } }
		 * 
		 * int num=1;
		 * 
		 * //print odd values from 1 to 10
		 * 
		 * while(num<=10) { if(num%2!=0) { System.out.println(num); } num++; }
		 */
	
		/*
		 * //print a to z using for loop
		 * 
		 * for(char alp='a';alp<='z';alp++) { System.out.println(alp); }
		 */
		
		/*
		 * //examples of infinite loop
		 * 
		 * while(true) { System.out.
		 * println("I have got a new job in Bangalore whose package is 20 LPA... and I have resigned DXC.Technology"
		 * );
		 * 
		 * }
		 */
		
	/*	for(int i=0;i<=10;)
		{
			System.out.println("I have got a new job in Bangalore whose package is 20 LPA and I have resigned from DXC.Technology. This new job is giving me so much happiness");
		}*/
		
		for(;;)
		{
			System.out.println("I am an infinite loop");
		}
			
	}

}
