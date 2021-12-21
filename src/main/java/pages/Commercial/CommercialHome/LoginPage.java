package pages.Commercial.CommercialHome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "username")
	WebElement userNameTxtBox;

	@FindBy(id = "password")
	WebElement passwordTxtBox;

	@FindBy(id = "kc-login")
	WebElement loginBtn;
	
	@FindBy(css = "span.mat-button-wrapper")
	public WebElement profileName;

	public void UserLogin(String userName, String password) 
	{
		setTextElementText(userNameTxtBox, userName);
		setTextElementText(passwordTxtBox, password);
		clickButton(loginBtn);
	}
}
