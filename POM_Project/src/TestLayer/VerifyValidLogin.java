package TestLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import PageLayer.LoginPageNew;
import PageLayer.OrangeHomePage;

public class VerifyValidLogin extends OrangeHomePage {

	@Test
	public void checklogin()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		 driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//WebDriver driver = BrowserFactory.startBrowser("chrome", "https://opensource-demo.orangehrmlive.com/");
	
		LoginPageNew login = PageFactory.initElements(driver, LoginPageNew.class);
	
		login.LoginHRM("Admin", "admin123");
		
		OrangeHomePage hp = PageFactory.initElements(driver, OrangeHomePage.class);
		
	
		hp.checkHomepage("Mr Maqdoom", "Junaid");
	
	 
	}
}
