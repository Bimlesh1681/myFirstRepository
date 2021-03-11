package Interface;

public class TestBrowser {

	static String browser = "Chrome";
	static Webdriver driver;

	public static void main(String[] args) {

		if (browser.equals("Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("Edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Incorrect browser parameter passed");
		}

		driver.get("http://www.google.com");
		String title = driver.getTitle();
		if (title.equals("Google")) {
			System.out.println("Page title validation passed");
		} else {
			System.out.println("Page title validation failed");
		}

		driver.findElement("user_id");
		driver.click();
		driver.sendKeys();
		driver.close();
	}

}
