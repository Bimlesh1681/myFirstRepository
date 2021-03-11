package Abstraction;

public abstract class Page {

	public Page()
	{
		System.out.println("Page class constructor");
	}
	
	public abstract void pageUrl();
	
	public abstract void title();
	
	public abstract void header();
	
	public final static void pageLogo()
	{
		System.out.println("Page logo");
	}
	
	public void pageLoadTime()
	{
		System.out.println("Page load time is 20 seconds");
	}
}
