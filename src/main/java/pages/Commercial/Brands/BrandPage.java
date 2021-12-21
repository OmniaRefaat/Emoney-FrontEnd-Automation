package pages.Commercial.Brands;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.Commercial.CommercialHome.PageBase;


public class BrandPage extends PageBase {

	public BrandPage(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-brand/form/mat-card/mat-card-content/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/input")
	WebElement brandArabicNameTxtBox;

	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-brand/form/mat-card/mat-card-content/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input")
	WebElement brandEnglishNameTxtBox;

	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-brands/div[1]/div[1]/h2")
	public WebElement brandListNameTxtBox;
	
	/*
	@FindBy(id = "mat-slide-toggle-1")
	public WebElement brandActivationBtn;
	*/
	/*
	@FindBy(xpath = "//mat-slide-toggle[@data-testid='toggleActivation'")
	public WebElement brandActivationBtn;
	*/
	
	//@FindBy(xpath = "//*[@id=\"mat-dialog-0\"]/app-confirm-dialog/div[2]/button[2]")
	//public WebElement activationBtn;
	
	

	//@FindBy(xpath = "//*[@id=\"mat-slide-toggle-1\"]/label/div/div")
	//public WebElement activationBtn;
	//@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-brands/div[1]/div[1]/h2")
	//WebElement fileSubmit = driver.findElement(By.xpath("/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-brand/form/mat-card/mat-card-content/div[3]/div/div/button"));
	/*
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav/div/mat-nav-list/div/mat-nav-list/a[2]/div")
	WebElement serviceCategoryItem;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-service-category/div[1]/div[2]/button")
	WebElement CreateServiceCategoryBtn;
	
	public void CreateServiceCategory() 
	{
		clickButton(serviceCategoryItem);
		clickButton(CreateServiceCategoryBtn);
	}
*/
	/*
	public void CreateBrand(String arabicName, String englishName) 
	{
		setTextElementText(brandArabicNameTxtBox, arabicName);
		setTextElementText(brandEnglishNameTxtBox, englishName);
	}
	 */
	public void CreateBrand(String arabicName, String englishName) 
	{
		setTextElementText(brandArabicNameTxtBox, arabicName);
		setTextElementText(brandEnglishNameTxtBox, englishName);
	}
	
}
