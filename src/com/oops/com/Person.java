package com.oops.com;

public class Person {

	String name;
	int age;
	String city;
	
	public static void main(String[] args) {
	
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
		p1.name = "Bimlesh";
		p1.age = 25;
		p1.city = "New York";
		
		p2.name = "Tom";
		p2.age = 28;
		p2.city = "Brussels";
		
		p3.name = "Jerry";
		p3.age = 32;
		p3.city = "Tokyo";
		
		System.out.println("--------------Displaying P1 Data-------------");
		
		System.out.println(p1.name+" "+p1.age+" "+p1.city);
		
		System.out.println("--------------Displaying P2 Data--------------");
		
		System.out.println(p2.name+" "+p2.age+" "+p2.city);
		
		System.out.println("--------------Displaying P3 Data--------------");
		
		System.out.println(p3.name+" "+p3.age+" "+p3.city);
		
		
		System.out.println("------------------------------------------------");
		
		p1=p2;
		
		System.out.println("--------------Displaying P1 Data-------------");
		
		System.out.println(p1.name+" "+p1.age+" "+p1.city);
		
		p2=p3;
		
		System.out.println("--------------Displaying P2 Data--------------");
		
		System.out.println(p2.name+" "+p2.age+" "+p2.city);
		
		p3=p1;
		
		System.out.println("--------------Displaying P3 Data--------------");
		
		System.out.println(p3.name+" "+p3.age+" "+p3.city);
		
	}

}
