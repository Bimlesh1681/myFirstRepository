package POJO;

public class Registration {

	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String address;

	public Registration(String firstName, String lastName, String email, String phone, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}

	public void registerUser(Registration reg)
	{
		System.out.println("User registration details are: ");
		System.out.println(reg.firstName+" "+reg.lastName+" "+reg.email+" "+reg.phone+ " "+reg.address);
	}
}
