package Interface;

public interface Webdriver 
{
	
	public void get(String url);
	public String getTitle();
	public void findElement(String locator);
	public void click();
	public void sendKeys();
	public void close();
	
	
}
