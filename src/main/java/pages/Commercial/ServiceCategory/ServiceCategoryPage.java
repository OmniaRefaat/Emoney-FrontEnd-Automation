package pages.Commercial.ServiceCategory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.Commercial.CommercialHome.PageBase;

public class ServiceCategoryPage extends PageBase {

	public ServiceCategoryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-service-category/form/mat-card/mat-card-content/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/input")
	WebElement arNameTxt;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-service-category/form/mat-card/mat-card-content/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input")
	WebElement enNameTxt;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-service-category/form/mat-card/mat-card-content/div[2]/mat-form-field[2]/div/div[1]/div[3]/textarea")
	WebElement descrTxt;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-service-category/form/mat-card/mat-card-content/div[4]/div/div/button")
	WebElement ServiceCatBtn;
	

	
	
	public void FillServiceCatData(String ArName, String EnName, String Desc)
	{
	
		setTextElementText(arNameTxt, ArName);
		setTextElementText(enNameTxt, EnName);
		setTextElementText(descrTxt, Desc);
		//clickButton(ServiceCatBtn);
	}

	public void ConfirmCreate() {
	clickButton(ServiceCatBtn);
	}

	
}
