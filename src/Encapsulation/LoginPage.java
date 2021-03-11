package Encapsulation;

public class LoginPage {

	private String username;
	private String password;
	
	/*
	 * public void setUsername(String username) { this.username=username; }
	 * 
	 * public String getUsername() { return username; }
	 * 
	 * public void setPassword(String password) { this.password = password; }
	 * 
	 * public String getPassword() { return password; }
	 */
	
	public LoginPage(String username, String password)
	{
		this.username=username;
		this.password=password;
	}
	
	
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public void doLogin(String username, String password)
	{
		System.out.println("Login to the system");
		System.out.println("Login with username: "+username);
		System.out.println("Login with password: "+password);
		
	}
}