package pages.Commercial.Service;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.Commercial.CommercialHome.PageBase;

public class ServiceListPage extends PageBase {
    public ServiceListPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-service/div[2]/div[1]/app-filteration-results/div/div[1]/div[2]/button/span[1]")
    WebElement serviceFilterBtn;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-service-filteration-dialog/div/div[2]/form/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/input")
    WebElement serviceEnNameTxt;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-service-filteration-dialog/div/div[2]/form/div[1]/div[2]/mat-form-field/div/div[1]/div[3]")
    WebElement statusDdl;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-service-filteration-dialog/div/div[2]/form/div[2]/div[1]/button")
    WebElement applyBtn;

    @FindBy(xpath = "/html/body/div[2]/div[4]/div/div/div/mat-option[2]")
    WebElement activeOptionBtn;

    @FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-service/div[2]/div[1]/app-filteration-results/div/div[2]/div[1]/span[2]")
    WebElement clearSeaBtn;

    @FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-service/div[2]/div[2]/table/tbody/tr[1]/td[7]")
    WebElement activeBtn;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-confirm-dialog/div[2]/button[2]")
    WebElement yesOptionBtn;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-service-filteration-dialog/div/div[2]/form/div[2]/div[2]")
    WebElement closeBtn;

    @FindBy(xpath = "/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-service/div[2]/div[2]/table/tbody/tr")
    public WebElement noDataFoundText;

    public void FilterClick()
    {
        clickButton(serviceFilterBtn);
    }

    public void FilterByStatus()
    {
        clickButton(statusDdl);
        clickButton(activeOptionBtn);
        clickButton(applyBtn);
    }

    public void FilterByService(String serviceName)
    {
        setTextElementText(serviceEnNameTxt, serviceName);
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
