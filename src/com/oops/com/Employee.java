package com.oops.com;

public class Employee {

	String name;
	int id;
	String dept;
	double salary;
	boolean isPerm;

	public Employee()
	{
		System.out.println("Default contructor of Employee class");
	}
	
	public Employee(String name, int id, String dept) {
		this.name = name;
		this.id = id;
		this.dept = dept;
	}

	public Employee(String name, int id, String dept, boolean isPerm)
	{
		this.name=name;
		this.id=id;
		this.dept=dept;
		this.isPerm=isPerm;
	}
		
	public Employee(String name, int id, String dept, double salary, boolean isPerm) {
		super();
		this.name = name;
		this.id = id;
		this.dept = dept;
		this.salary = salary;
		this.isPerm = isPerm;
	}

	public static void main(String[] args) {
	
		Employee e1 = new Employee();
		
		Employee e2 = new Employee("Bimlesh", 60042193, "Testing");
		
		System.out.println(e2.name+" "+e2.id+" "+e2.dept);
		
		Employee e3 = new Employee("Harry", 60042194, "Development", false);
		
		System.out.println(e3.name+" "+e3.id+" "+e3.dept+" "+e3.isPerm);
		
		Employee e4 = new Employee("Steve", 60042195, "Database", 12.55, true);
		
		System.out.println(e4.name+" "+e4.id+" "+e4.dept+" "+e4.salary+" "+e4.isPerm);
	}

}
