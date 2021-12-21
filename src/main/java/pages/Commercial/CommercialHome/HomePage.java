package pages.Commercial.CommercialHome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(className = "mat-h1")
	WebElement dashboardTxt;
	
	@FindBy(xpath = "//div[contains(text(),'Service-Category')]")
	WebElement serviceProviderPage;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav/div/mat-nav-list/div/a[2]/div/span")
	WebElement commercailTxt;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav/div/mat-nav-list/div/mat-nav-list/a[3]/div")
	WebElement brandTxt;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-brands/div[1]/div[2]/button")
	WebElement createBrandBtn;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav/div/mat-nav-list/div/mat-nav-list/a[4]/div")
	WebElement servicePage;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav/div/mat-nav-list/div/mat-nav-list/a[5]/div")
	WebElement subServicePage;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav/div/mat-nav-list/div/mat-nav-list/a[6]/div")
	WebElement sellingSchemePage;
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-service/div[1]/div[2]/button/span[1]")
	WebElement createServiceBtn;

	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-sub-service/div[1]/div[2]/button/span[1]")
	WebElement createSubServiceBtn;

	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-selling-scheme/div[1]/div[2]/button")
	WebElement createSellingBtn;

	@FindBy(xpath = "//span[contains(text(),'Create a Service Category')]")
	WebElement createServiceCategoryBtn;

	@FindBy(xpath = "//div[contains(text(),'RETAILERS SERVICES')]")
	WebElement retailersServiceTxt;

	public void NavigateToRetailersServicesPage()
	{
		clickButton(retailersServiceTxt);
	}

	public void CreateServiceCategoryObj()
	{
		clickButton(createServiceCategoryBtn);
	}

	public void CreateSellingSch()
	{
		clickButton(createSellingBtn);
	}

	public void CreateSubServ()
	{
		clickButton(createSubServiceBtn);
	}

	public void CreateServ()
	{
		clickButton(createServiceBtn);
	}
	
	public void ServiceProvider()
	{
		clickButton(commercailTxt);
		//clickButton(brandTxt);
		//clickButton(createBrandBtn);
	}
	
	public void OpenBrandPage()
	{
		clickButton(brandTxt);
		//clickButton(createBrandBtn);
	}

	public void CreateBrand()
	{
		//clickButton(brandTxt);
		clickButton(createBrandBtn);
	}
	
	public void CreateSer()
	{
		clickButton(servicePage);
	}
	
	public void CreateSubSer()
	{
		clickButton(subServicePage);
	}
	
	public void CreateSellingScheme()
	{
		clickButton(sellingSchemePage);
	}

	public void NavigateToServiceProvider()
	{
		clickButton(serviceProviderPage);
	}
}
