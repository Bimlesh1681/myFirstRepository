package Encapsulation;

public class BrowserTest {

	public static void main(String[] args) {
		
		Browser b = new Browser();
		b.setBrowserVersion(10);
		System.out.println(b.getBrowserVersion());
		b.launchBrowser();
		
	}

}
