package Abstraction;

public class LoginPage extends Page {

	public LoginPage()
	{
		System.out.println("LoginPage constructor");
	}
	
	@Override
	public void pageUrl() {
		System.out.println("http://www.evolution.com/loginpage");
		
	}

	@Override
	public void title() {
		System.out.println("Login Page Title");
		
	}

	@Override
	public void header() {
		System.out.println("Login Page headers");
		
	}

	@Override
	public void pageLoadTime()
	{
		System.out.println("Login page load time is 10 seconds");
	}
	
	public void doLogin(String username, String password)
	{
		System.out.println("Login with: "+username+" and password: "+password);
	}
	
}
