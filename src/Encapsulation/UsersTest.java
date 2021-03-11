package Encapsulation;

public class UsersTest {

	public static void main(String[] args) {
		/*
		 * EcommUsers u1 = new EcommUsers(); u1.setUsername("bimleshm@gmail.com");
		 * u1.setPassword("Password123"); //String un = u1.doLogin(u1.getUsername(),
		 * u1.getPassword());
		 */
		
		LoginPage l1_customer = new LoginPage("bimleshm@gmail.com", "Password123");
		l1_customer.doLogin(l1_customer.getUsername(), l1_customer.getPassword());
		
		
		
	}

}
