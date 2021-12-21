package tests.Commercail.ServiceCategory;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Commercial.CommercialHome.HomePage;
import pages.Commercial.ServiceCategory.ServiceCategoryListPage;
import pages.Commercial.ServiceCategory.ServiceCategoryPage;
import tests.Commercail.CommercailHome.TestBase;

import java.awt.*;

public class ServiceCategoryListTest extends TestBase {
    ServiceCategoryListPage serviceCatListObject;
    HomePage homeObject;
    ServiceCategoryPage serviceCategoryObject;
    int min = 10;
    int max = 100;
    int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);

    @Test(priority=1)
    public void FilterServiceCategoryName() throws InterruptedException {
        homeObject = new HomePage(driver);
        homeObject.NavigateToServiceProvider();
        serviceCatListObject = new ServiceCategoryListPage(driver);
        serviceCatListObject.FilterClick();
        serviceCatListObject.FilterByServiceCategory("fvvv");
    }

    @Test(priority=2)
    public void ClearFilterSearchByName()
    {
        serviceCatListObject = new ServiceCategoryListPage(driver);
        serviceCatListObject.ClearSearch();
    }

    @Test(priority=3)
    public void FilterByActiveStatus()
    {
        homeObject = new HomePage(driver);
        homeObject.NavigateToServiceProvider();
        serviceCatListObject = new ServiceCategoryListPage(driver);
        serviceCatListObject.FilterClick();
        serviceCatListObject.FilterByStatus();
    }

    @Test(priority=4)
    public void ClearFilterSearchByStatus()
    {
        serviceCatListObject = new ServiceCategoryListPage(driver);
        serviceCatListObject.ClearSearch();
    }

    @Test(priority=5)
    public void SearchWithServiceCategoryNameNotExist()
    {
        homeObject = new HomePage(driver);
        homeObject.NavigateToServiceProvider();
        serviceCatListObject = new ServiceCategoryListPage(driver);
        serviceCatListObject.FilterClick();
        serviceCatListObject.FilterByServiceCategory("bbbbbbbb");
        Assert.assertTrue(serviceCatListObject.noDataFoundText.isDisplayed());

    }

    @Test(priority=6)
    public void CloseFilterDialogue()
    {
        homeObject = new HomePage(driver);
        homeObject.NavigateToServiceProvider();
        serviceCatListObject = new ServiceCategoryListPage(driver);
        serviceCatListObject.FilterClick();
        serviceCatListObject.CloseFilter();
    }

    @Test(priority=7)
    public void ActiveServiceCategory() throws AWTException, InterruptedException {
        homeObject = new HomePage(driver);
        homeObject.CreateServiceCategoryObj();
        serviceCategoryObject = new ServiceCategoryPage(driver);
        serviceCategoryObject.FillServiceCatData("testCatActivation"+random_int, "testCatActivation"+random_int, "testCatActivation"+random_int);
        serviceCategoryObject.ConfirmCreate();
        serviceCatListObject = new ServiceCategoryListPage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,3000)");
        Thread.sleep(3000);
        serviceCatListObject.Active();
    }
}
