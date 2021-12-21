package pages.Commercial.ServiceCategory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.Commercial.CommercialHome.PageBase;

public class ServiceCategoryListPage extends PageBase {
    public ServiceCategoryListPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-service-category/div[2]/div[1]/app-filteration-results/div/div[1]/div[2]/button/span[1]")
    WebElement serviceCategoryFilterBtn;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-service-category-filteration-dialog/div/div[2]/form/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/input")
    WebElement serviceCategoryEnNameTxt;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-service-category-filteration-dialog/div/div[2]/form/div[1]/div[2]/mat-form-field/div/div[1]/div[3]")
    WebElement statusDdl;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement applyBtn;

    @FindBy(xpath = "/html/body/div[2]/div[4]/div/div/div/mat-option[2]")
    WebElement activeOptionBtn;

    @FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-service-category/div[2]/div[1]/app-filteration-results/div/div[2]/div[1]/span[2]")
    WebElement clearSeaBtn;

    @FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-service-category/div[2]/div[2]/table/tbody/tr[1]/td[6]")
    WebElement activeBtn;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-confirm-dialog/div[2]/button[2]")
    WebElement yesOptionBtn;

    @FindBy(xpath = "//div[@class='dialog_close_class']")
    WebElement closeBtn;

    @FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-service-category/div[2]/div[2]/table/tbody/tr")
    public WebElement noDataFoundText;

    public void FilterClick()
    {
        clickButton(serviceCategoryFilterBtn);
    }


    public void FilterByStatus()
    {
        clickButton(statusDdl);
        clickButton(activeOptionBtn);
        clickButton(applyBtn);
    }

    public void FilterByServiceCategory(String serviceCatName)
    {
        setTextElementText(serviceCategoryEnNameTxt, serviceCatName);
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
