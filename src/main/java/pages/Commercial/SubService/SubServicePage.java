package pages.Commercial.SubService;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.Commercial.CommercialHome.PageBase;

public class SubServicePage extends PageBase {

	public SubServicePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-sub-service/form/mat-card/mat-card-content/div[2]/div[1]/mat-form-field/div/div[1]/div[3]/input")
	WebElement subServiceArabicNameTxt;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-sub-service/form/mat-card/mat-card-content/div[2]/div[2]/mat-form-field/div/div[1]/div[3]/input")
	WebElement subServiceEnglishNameTxt;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-sub-service/form/mat-card/mat-card-content/div[1]/div[1]/ngx-select-dropdown/div/button")
	WebElement serviceBtn;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-sub-service/form/mat-card/mat-card-content/div[1]/div[1]/ngx-select-dropdown/div/div/div/input")
    WebElement searchTxt;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-sub-service/form/mat-card/mat-card-content/div[1]/div[1]/ngx-select-dropdown/div/div/ul[2]/li[1]")
    WebElement chooseBtn;


	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-sub-service/div[1]/div[1]/h2")
	public WebElement subServiceListNameTxtBox;

	public void changeService(String searchKey)
	{
		serviceBtn.sendKeys("service brand 2");
		setTextElementText(searchTxt, searchKey);
		clickButton(chooseBtn);
	}
	
	

	
	

	
	public void CreateSubServiceComponent(String arabicName, String englishName) 
	{
		setTextElementText(subServiceArabicNameTxt, arabicName);
		setTextElementText(subServiceEnglishNameTxt, englishName);
		//clickButton(serviceBtn);
	}
}
