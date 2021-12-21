package pages.Commercial.Brands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.Commercial.CommercialHome.PageBase;

public class BrandListPage extends PageBase {
    public BrandListPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-brands/div[2]/div[1]/app-filteration-results/div/div[1]/div[2]/button")
    WebElement brandFilterBtn;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-brand-filteration-dialog/div/div[2]/form/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/input")
    WebElement brandEnNameTxt;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-brand-filteration-dialog/div/div[2]/form/div[1]/div[2]/mat-form-field/div/div[1]/div[3]")
    WebElement statusDdl;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-brand-filteration-dialog/div/div[2]/form/div[2]/div[1]/button")
    WebElement applyBtn;
    @FindBy(xpath = "/html/body/div[2]/div[4]/div/div/div/mat-option[2]")
    WebElement activeOptionBtn;

    @FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-brands/div[2]/div[1]/app-filteration-results/div/div[2]/div[1]/span[2]")
    WebElement clearSeaBtn;

    @FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-brands/div[2]/div[2]/table/tbody/tr[1]/td[4]")
    WebElement activeBtn;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-confirm-dialog/div[2]/button[2]")
    WebElement yesOptionBtn;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-brand-filteration-dialog/div/div[2]/form/div[2]/div[2]")
    WebElement closeBtn;

    @FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-brands/div[2]/div[2]/table/tbody/tr")
    public WebElement noDataFoundText;

    public void FilterClick()
    {
        clickButton(brandFilterBtn);

       // JavascriptExecutor js = (JavascriptExecutor)driver;
       // WebElement button = driver.findElement(By.className("mat-focus-indicator.blueColor.button-icon-txt.mat-icon-button.mat-button-base"));
       // js.executeScript("argument[0].click();", button);

        //driver.findElements(By.cssSelector("mat-icon")).get(0).click();
    }

    public void FilterByStatus()
    {
        //select = new Select(statusDdl);
        //select.selectByVisibleText(status);
        clickButton(statusDdl);
        clickButton(activeOptionBtn);
        clickButton(applyBtn);

    }

    public void FilterByBrand(String brandName)
    {
        setTextElementText(brandEnNameTxt, brandName);
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
