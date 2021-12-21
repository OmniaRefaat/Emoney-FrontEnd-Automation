package pages.Commercial.SubService;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.Commercial.CommercialHome.PageBase;

public class SubServiceListPage extends PageBase {
    public SubServiceListPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-sub-service/div[2]/div[1]/app-filteration-results/div/div[1]/div[2]/button/span[1]")
    WebElement subServiceFilterBtn;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-sub-service-filtertion-dialog/div/div[2]/form/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/input")
    WebElement subServiceEnNameTxt;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-sub-service-filtertion-dialog/div/div[2]/form/div[1]/div[2]/mat-form-field/div/div[1]/div[3]")
    WebElement statusDdl;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-sub-service-filtertion-dialog/div/div[2]/form/div[2]/div[1]/button")
    WebElement applyBtn;

    @FindBy(xpath = "/html/body/div[2]/div[4]/div/div/div/mat-option[2]")
    WebElement activeOptionBtn;

    @FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-sub-service/div[2]/div[1]/app-filteration-results/div/div[2]/div[1]/span[2]")
    WebElement clearSeaBtn;

    @FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-sub-service/div[2]/div[2]/table/tbody/tr[1]/td[6]")
    WebElement activeBtn;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-confirm-dialog/div[2]/button[2]")
    WebElement yesOptionBtn;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-sub-service-filtertion-dialog/div/div[2]/form/div[2]/div[2]")
    WebElement closeBtn;

    @FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-sub-service/div[2]/div[2]/table/tbody/tr")
    public WebElement noDataFoundText;

    public void FilterClick()
    {
        clickButton(subServiceFilterBtn);

        // JavascriptExecutor js = (JavascriptExecutor)driver;
        // WebElement button = driver.findElement(By.className("mat-focus-indicator.blueColor.button-icon-txt.mat-icon-button.mat-button-base"));
        // js.executeScript("argument[0].click();", button);

        //driver.findElements(By.cssSelector("mat-icon")).get(0).click();
    }
    public void FilterByStatus()
    {
        clickButton(statusDdl);
        clickButton(activeOptionBtn);
        clickButton(applyBtn);
    }

    public void FilterBySubService(String subServiceName)
    {
        setTextElementText(subServiceEnNameTxt, subServiceName);
        clickButton(applyBtn);
    }

    public void ClearSearch()
    {
        clickButton(clearSeaBtn);
    }

    public void Active()
    {
        clickButton(activeBtn);
        clickButton(yesOptionBtn);
    }
    public void CloseFilter()
    {
        clickButton(closeBtn);
    }
}
