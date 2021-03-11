package Encapsulation;

public class Browser {

	private int browserVer;
	
	public void setBrowserVersion(int browserVer)
	{
		this.browserVer = browserVer;
	}
	
	public int getBrowserVersion()
	{
		return browserVer;
	}
	
	public void launchBrowser()
	{
		System.out.println("launch Browser");
		checkBrowserVersion();
		checkOSVersion();
		checkBrowserUpdate();
		
	}
	
	private void checkBrowserVersion()
	{
		System.out.println("Check browser version");
	}
	
	private void checkOSVersion()
	{
		System.out.println("Check OS version");
	}
	
	private void checkBrowserUpdate()
	{
		System.out.println("Check browser update");
	}
}
