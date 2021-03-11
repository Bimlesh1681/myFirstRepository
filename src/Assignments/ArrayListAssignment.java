package Assignments;

public class ArrayListAssignment {

	public static void main(String[] args) {
		
		String player[] = new String[6];
		
		player[0] = "Sachin";
		player[1] = "28";
		player[2] = "Mumbai Indian";
		player[3] = "16-01-1990";
		player[4] = "M";
		player[5] = "90.90";
		
		System.out.println("The length of the array is "+player.length);
		
		for(int i=0;i<player.length;i++)
		{
			System.out.println(player[i]);
		}
		

	}

}
