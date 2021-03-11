package Interface;

public class ChromeDriver implements Webdriver
{

	public ChromeDriver() {
	System.out.println("Launching Chrome Browser...");
	}
	
	@Override
	public void get(String url) {
		System.out.println("The url is: "+url);
		
	}

	@Override
	public String getTitle() {
		return "Google";
	}

	@Override
	public void findElement(String locator) {
		System.out.println("Finding the element with locator: "+locator);
		
	}

	@Override
	public void click() {
		System.out.println("Clicking the element");
		
	}

	@Override
	public void sendKeys() {
		System.out.println("Sending text to the field");
		
	}

	@Override
	public void close() {
		System.out.println("Closing the application");
		
	}
	

}
