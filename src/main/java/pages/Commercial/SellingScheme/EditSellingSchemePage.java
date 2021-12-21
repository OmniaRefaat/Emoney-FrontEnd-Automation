package pages.Commercial.SellingScheme;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.Commercial.CommercialHome.PageBase;

public class EditSellingSchemePage extends PageBase {
    public EditSellingSchemePage(WebDriver driver) {
        super(driver);
    }
    /*
  @FindBy(xpath = "//body[@class='mat-typography']/app-root[@ng-version='11.2.14']/app-navigation/mat-sidenav-container[@class='mat-drawer-container mat-sidenav-container sidenav-container']/mat-sidenav-content[@class='mat-drawer-content mat-sidenav-content sidenav-content']/app-selling-scheme[@class='ng-star-inserted']/div[@class='table-main-container']/div[@class='table-container']/table[@class='mat-table cdk-table mat-sort']/tbody[@role='rowgroup']/tr[1]/td[10]")
    WebElement EditBtn;

    @FindBy(xpath = "//*[contains(text(),'ORA_SET')]")
    WebElement newSettlentBtn;

    @FindBy(xpath ="/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-edit-selling-scheme/form/mat-card/div/div/div/button/span[1]/span")
    WebElement updateBtn;



    public void EditSettlement()
    {
        clickButton(EditSettlentBtn);
        clickButton(newSettlentBtn);
        clickButton(updateBtn);
    }
*/

    @FindBy(xpath = "//div[@class='col']//ngx-select-dropdown[@class='full-width ng-untouched ng-pristine ng-valid ng-star-inserted']//div[@class='ngx-dropdown-container']//button[@type='button']//span[@class='nsdicon-angle-down']")
    WebElement editSettlementSelectBtn;

    @FindBy(xpath = "//span[@class='nsdicon-close']")
    WebElement discardOldSelectionBtn;

    @FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-edit-selling-scheme/form/mat-card/mat-card-content/div[4]/div[1]/ngx-select-dropdown/div/div/div/input")
    WebElement chooseSelectedOptionTxt;

    @FindBy(xpath = "//li[@class='ng-star-inserted']")
    WebElement SelectedOptionBtn;

    @FindBy(xpath = "//button[@class='mat-focus-indicator submitButton mat-raised-button mat-button-base']")
    WebElement UpdateBtn;

    @FindBy(xpath = "//body[@class='mat-typography']/app-root[@ng-version='11.2.14']/app-navigation/mat-sidenav-container[@class='mat-drawer-container mat-sidenav-container sidenav-container']/mat-sidenav-content[@class='mat-drawer-content mat-sidenav-content sidenav-content']/app-selling-scheme[@class='ng-star-inserted']/div[@class='table-main-container']/div[@class='table-container']/table[@class='mat-table cdk-table mat-sort']/tbody[@role='rowgroup']/tr[1]/td[10]/button[2]/span[1]/mat-icon[1]")
    WebElement detailsBtn;

    @FindBy(xpath = "//td[@class='mat-cell cdk-cell table-column-padding cdk-column-settlement mat-column-settlement ng-star-inserted']")
    public WebElement settlementNameTxt;

    @FindBy(xpath = "//div[@class='col ng-star-inserted']//ngx-select-dropdown[@class='full-width ng-untouched ng-pristine ng-valid ng-star-inserted']//div[@class='ngx-dropdown-container']//button[@type='button']//span[@class='nsdicon-angle-down']")
    WebElement editflowBtn;
    @FindBy(xpath = "//span[@class='nsdicon-close']")
    WebElement discardOldFlowSelectionBtn;

    @FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-edit-selling-scheme/form/mat-card/mat-card-content/div[4]/div[2]/ngx-select-dropdown/div/div/div/input")
    WebElement chooseSelectedFlowOptionTxt;

    @FindBy(xpath = "//li[@class='ng-star-inserted']")
    WebElement SelectedFlowOptionBtn;

    @FindBy(xpath = "//body[@class='mat-typography']/app-root[@ng-version='11.2.14']/app-navigation/mat-sidenav-container[@class='mat-drawer-container mat-sidenav-container sidenav-container']/mat-sidenav-content[@class='mat-drawer-content mat-sidenav-content sidenav-content']/app-selling-scheme[@class='ng-star-inserted']/div[@class='table-main-container']/div[@class='table-container']/table[@class='mat-table cdk-table mat-sort']/tbody[@role='rowgroup']/tr[1]/td[8]")
    public WebElement workflowTxt;

    public void EditSet(String newSettlement){
        clickButton(editSettlementSelectBtn);
        clickButton(discardOldSelectionBtn);
        setTextElementText(chooseSelectedOptionTxt, newSettlement);
        clickButton(SelectedOptionBtn);
    }

    public void Editflow(String workFlow){
        clickButton(editflowBtn);
        clickButton(discardOldSelectionBtn);
        setTextElementText(chooseSelectedFlowOptionTxt, workFlow);
        clickButton(SelectedFlowOptionBtn);
    }

    public void UpdateButton()
    {
        clickButton(UpdateBtn);
    }

    public void SellingDetails()
    {
        clickButton(detailsBtn);
    }



}
