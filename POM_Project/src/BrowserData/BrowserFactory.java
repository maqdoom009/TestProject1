package BrowserData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {

	static WebDriver driver;
	
	public static WebDriver startBrowser(String BrowserName, String url)
	{
		if(BrowserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if (BrowserName.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdiver.chrome.driver","‪D:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if (BrowserName.equalsIgnoreCase("IE")) {
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.get("");
		
		return driver;
	}
}
