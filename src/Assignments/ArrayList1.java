package Assignments;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		
		colors.add("Red");
		colors.add("Yellow");
		colors.add("Purple");
		colors.add("Pink");
		
		//colors.stream().forEach(ele-->System.out.println(ele));
				
		/*
		 * System.out.println("Elements before swap"); for(String col: colors) {
		 * System.out.println(col); }
		 * 
		 * System.out.println("Elements after swap");
		 * 
		 * String temp = colors.get(0); colors.set(0, colors.get(1)); colors.set(1,
		 * temp);
		 * 
		 * for(String col: colors) { System.out.println(col); }
		 */
		/*
		 * System.out.println("--------------Before updating the array list----------");
		 * 
		 * for(String col: colors) { System.err.println(col); }
		 * 
		 * System.out.println("--------------After updating the array list----------");
		 */		
		/*
		 * colors.add(0, "Purple"); colors.add(6, "Brown"); colors.set(6, "Orange");
		 * 
		 * System.out.println(colors.subList(0, 3));
		 */
		
		//System.out.println("The element at the 5th index is "+colors.get(5));
				
		//colors.remove(3);
		
		/*
		 * for(int i=colors.size()-1;i>=0;i--) { System.out.println(colors.get(i)); }
		 */
				
		/*
		 * for(String col: colors) { System.err.println(col); }
		 * 
		 * boolean c = colors.contains("Red"); System.out.println(c);
		 */				
		
	}

}
