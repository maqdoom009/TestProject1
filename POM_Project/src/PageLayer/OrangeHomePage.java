package PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class OrangeHomePage {
public static WebDriver driver;
	@FindBy(linkText ="Admin")
	WebElement Admin;
	
	@FindBy(linkText = "User Management")
	WebElement usermanage;
	
	@FindBy(linkText = "Users")
	WebElement user;
	
	@FindBy(id = "btnAdd")
	WebElement adduser;
	
	@FindBy(id = "systemUser_employeeName_empName")
	WebElement Employeename;
	
	@FindBy(id = "systemUser_userName")
	WebElement Username;
	
	@FindBy(id = "btnSave")
	WebElement save;
	
	public void checkHomepage(String empname, String username)
	{
		Actions a = new Actions(driver);
		
		a.moveToElement(Admin).perform();
		
		a.moveToElement(usermanage).perform();
		
		a.moveToElement(user).click().build().perform();
		
		adduser.click();
		
		Employeename.sendKeys(empname);
		Username.sendKeys(username);
		save.click();
		
	}
}
