package TestLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import PageLayer.LoginPageNew;
import PageLayer.OrangeHomePage;

public class VerifyValidLogin  {

	@Test
 	public void checklogin()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		 WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
			
		LoginPageNew login = PageFactory.initElements(driver, LoginPageNew.class);
	
		login.LoginHRM("Admin", "admin123");
		
		
		driver.close();
	
	 
	}
}
