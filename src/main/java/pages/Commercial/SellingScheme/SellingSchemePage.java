package pages.Commercial.SellingScheme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.Commercial.CommercialHome.PageBase;

public class SellingSchemePage extends PageBase {

	public SellingSchemePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-select-service-provider/form/div/div[1]/ngx-select-dropdown/div/button")
	WebElement providerBtn;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-select-service-provider/form/div/div[1]/ngx-select-dropdown/div/div/div/input")
    WebElement searchTxt;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-select-service-provider/form/div/div[1]/ngx-select-dropdown/div/div/ul[2]/li")
    WebElement chooseBtn;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-select-service-provider/form/div/div[2]/ngx-select-dropdown/div/button")
	WebElement brandBtn;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-select-service-provider/form/div/div[2]/ngx-select-dropdown/div/div/div/input")
    WebElement searchBrandTxt;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-select-service-provider/form/div/div[2]/ngx-select-dropdown/div/div/ul[2]/li")
    WebElement chooseBrandBtn;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-select-service-provider/div/div[2]/table/tbody/tr[1]/td[5]/button")
	WebElement selectProceedBtn;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-confirm-dialog/div[2]/button[2]")
	WebElement yesConfirmBtn;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-selling-scheme/form/mat-card/mat-card-content/div[1]/div[1]/ngx-select-dropdown/div/button")
	WebElement serviceBtn;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-selling-scheme/form/mat-card/mat-card-content/div[1]/div[1]/ngx-select-dropdown/div/div/div/input")
    WebElement serviceSearchTxt;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-selling-scheme/form/mat-card/mat-card-content/div[1]/div[1]/ngx-select-dropdown/div/div/ul[2]/li")
    WebElement serviceChooseBtn;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-selling-scheme/form/mat-card/mat-card-content/div[2]/div/ngx-select-dropdown/div/button")
	WebElement sellingBrandBtn;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-selling-scheme/form/mat-card/mat-card-content/div[2]/div/ngx-select-dropdown/div/div/div/input")
    WebElement sellingBrandSearchTxt;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-selling-scheme/form/mat-card/mat-card-content/div[2]/div/ngx-select-dropdown/div/div/ul[2]/li")
    WebElement sellingBrandChooseBtn;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-selling-scheme/form/mat-card/mat-card-content/div[4]/div[1]/ngx-select-dropdown/div/button")
	WebElement settlementBtn;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-selling-scheme/form/mat-card/mat-card-content/div[4]/div[1]/ngx-select-dropdown/div/div/div/input")
    WebElement settlementSearchTxt;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-selling-scheme/form/mat-card/mat-card-content/div[4]/div[1]/ngx-select-dropdown/div/div/ul[2]/li")
    WebElement settlementChooseBtn;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-selling-scheme/form/mat-card/mat-card-content/div[4]/div[2]/ngx-select-dropdown/div/button")
	WebElement workflowBtn;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-selling-scheme/form/mat-card/mat-card-content/div[4]/div[2]/ngx-select-dropdown/div/div/div/input")
    WebElement workflowSearchTxt;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-selling-scheme/form/mat-card/mat-card-content/div[4]/div[2]/ngx-select-dropdown/div/div/ul[2]/li")
    WebElement workflowChooseBtn;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-selling-scheme/form/mat-card/mat-card-content/div[5]/div[1]/mat-form-field/div/div[1]/div[3]/input")
    WebElement sellingEnNameTxt;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-selling-scheme/form/mat-card/mat-card-content/div[5]/div[2]/mat-form-field/div/div[1]/div[3]/input")
    WebElement sellingArNameTxt;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-selling-scheme/form/mat-card/div/div/div/button")
    WebElement createSellingSchemeBtn;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-selling-scheme/div[2]/div[2]/table/tbody/tr[1]/td[9]/mat-slide-toggle/label/div/div")
    WebElement activeBtn;

	@FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-selling-scheme/div[1]/div[1]/h2")
	public WebElement sellingListNameTxtBox;

	@FindBy(xpath = "//body[@class='mat-typography']/app-root[@ng-version='11.2.14']/app-navigation/mat-sidenav-container[@class='mat-drawer-container mat-sidenav-container sidenav-container']/mat-sidenav-content[@class='mat-drawer-content mat-sidenav-content sidenav-content']/app-selling-scheme[@class='ng-star-inserted']/div[@class='table-main-container']/div[@class='table-container']/table[@class='mat-table cdk-table mat-sort']/tbody[@role='rowgroup']/tr[1]/td[10]/button[1]")
	WebElement editBtn;
	
	public void changeProvider(String searchKey)
	{
		clickButton(providerBtn);
		setTextElementText(searchTxt, searchKey);
		clickButton(chooseBtn);
	}
	
	public void changeBrand(String searchKey)
	{
		clickButton(brandBtn);
		setTextElementText(searchBrandTxt, searchKey);
		clickButton(chooseBrandBtn);
	}
	
	public void selectProceed()
	{
		clickButton(selectProceedBtn);
		clickButton(yesConfirmBtn);
	}
	
	public void chooseService(String serviceSearchKey)
	{
		clickButton(serviceBtn);
		setTextElementText(serviceSearchTxt, serviceSearchKey);
		clickButton(serviceChooseBtn);
	}
	
	public void chooseSellingBrand(String sellingBrandSearchKey)
	{
		clickButton(sellingBrandBtn);
		setTextElementText(sellingBrandSearchTxt, sellingBrandSearchKey);
		clickButton(sellingBrandChooseBtn);
	}
	
	public void chooseSettlement(String settlementSearchKey)
	{
		clickButton(settlementBtn);
		setTextElementText(settlementSearchTxt, settlementSearchKey);
		clickButton(settlementChooseBtn);
	}
	
	public void chooseWorkflow(String workflowSearchKey)
	{
		clickButton(workflowBtn);
		setTextElementText(workflowSearchTxt, workflowSearchKey);
		clickButton(workflowChooseBtn);
	}
	
	public void fillSchemeName(String EnName, String ArName)
	{
		setTextElementText(sellingArNameTxt, ArName);
		setTextElementText(sellingEnNameTxt, EnName);
	}
	
	public void createSellingfinal()
	{
		clickButton(createSellingSchemeBtn);
	}
	public void NavigateToEdit()
	{
		clickButton(editBtn);
	}
}
