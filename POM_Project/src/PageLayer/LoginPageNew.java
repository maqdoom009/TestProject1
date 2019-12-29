package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageNew {

	@FindBy(id = "txtUsername")
	WebElement username;
	
	@FindBy(name = "txtPassword")
	WebElement password;
	
	@FindBy(id = "btnLogin")
	WebElement login;
	
	public void LoginHRM(String userID, String Pwd){
		username.sendKeys(userID);
		password.sendKeys(Pwd);
		login.click();
	}
}
