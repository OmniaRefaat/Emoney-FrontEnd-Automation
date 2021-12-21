package pages.Commercial.Service;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.Commercial.CommercialHome.PageBase;

public class ServicePage extends PageBase {

	public ServicePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-service/form/mat-card/mat-card-content/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/input")
	WebElement serviceArabicNameTxt;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-service/form/mat-card/mat-card-content/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input")
	WebElement serviceEnglishNameTxt;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-service/form/mat-card/mat-card-content/div[2]/div[1]/ngx-select-dropdown/div/button")
	WebElement serviceCategoryBtn;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-service/form/mat-card/mat-card-content/div[2]/div[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]/div")
	WebElement rankBtn;
	
	
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-service/form/mat-card/mat-card-content/div[3]/div/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")
	WebElement groupByBtn;
	
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-service/form/mat-card/mat-card-content/div[5]/div/div/button")
	WebElement serviceBtn;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-service/form/mat-card/mat-card-content/div[2]/div[1]/ngx-select-dropdown/div/div/div/input")
    WebElement searchTxt;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-service/form/mat-card/mat-card-content/div[2]/div[1]/ngx-select-dropdown/div/div/ul[2]/li")
    WebElement chooseBtn;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div/mat-option[2]")
    WebElement brandOptionBtn;
	
	@FindBy(xpath = "//*[@id=\"mat-option-8\"]/span")
    WebElement rankOptionBtn;

	//@FindBy(xpath ="/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-service/form/mat-card/mat-card-content/div[5]/div/div/button")
	//public WebElement createSerBtn;

	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-service/div[1]/div[1]/h2")
	public WebElement serviceListNameTxtBox;



	
	public void changeServiceCategory(String searchKey)
	{
		serviceCategoryBtn.sendKeys("asmaa");
		setTextElementText(searchTxt, searchKey);
		clickButton(chooseBtn);
	}
	/*
	public void changeRank()
	{
		//select = new Select(rankBtn);
		//select.selectByVisibleText("1");
		clickButton(rankBtn);
		clickButton(rankOptionBtn);
	}
	*/
	public void changeGroup()
	{
		//select = new Select(groupByBtn);
		//select.selectByVisibleText("brand");
		//groupByBtn.sendKeys("brand");
		//clickButton(brandOptionBtn);
		clickButton(groupByBtn);
		clickButton(brandOptionBtn);
	}
	
	public void CreateServiceComponent(String arabicName, String englishName) 
	{
		setTextElementText(serviceArabicNameTxt, arabicName);
		setTextElementText(serviceEnglishNameTxt, englishName);
		//clickButton(serviceBtn);
	}
}
