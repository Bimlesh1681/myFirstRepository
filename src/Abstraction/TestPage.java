package Abstraction;

public class TestPage {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		lp.pageUrl();
		lp.title();
		lp.header();
		LoginPage.pageLogo();
		lp.pageLoadTime();
		lp.doLogin("bimlesh@gmail.com", "Password123");
		
		//top casting

		Page pg = new LoginPage();
		
		pg.pageUrl();
		pg.title();
		pg.header();
		Page.pageLogo();
		pg.pageLoadTime();
		
	}

}
