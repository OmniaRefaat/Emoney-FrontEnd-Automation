package tests.Commercail.SellingScheme;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Commercial.CommercialHome.HomePage;
import pages.Commercial.SellingScheme.SellingSchemeListPage;
import pages.Commercial.SellingScheme.SellingSchemePage;
import tests.Commercail.CommercailHome.TestBase;

import java.awt.*;

public class SellingSchemeListTest extends TestBase {
    SellingSchemeListPage sellingSchemeListObject;
    HomePage homeObject;
    SellingSchemePage sellingObject;
    int min = 10;
    int max = 100;
    int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);

    @Test(priority=1)
    public void FilterSellingName() throws InterruptedException {
        homeObject = new HomePage(driver);
        homeObject.CreateSellingScheme();
        sellingSchemeListObject = new SellingSchemeListPage(driver);
        sellingSchemeListObject.FilterClick();
        sellingSchemeListObject.FilterBySellingName("Bulk Print - Elantry");
        //brandListObject.ClearSearch();
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        // js.executeScript("scrollBy(0,3000)");
        //Thread.sleep(3000);
        //brandListObject.Active();
    }

    @Test(priority=2)
    public void ClearFilterSearchByName()
    {
        sellingSchemeListObject = new SellingSchemeListPage(driver);
        sellingSchemeListObject.ClearSearch();
    }

    @Test(priority=3)
    public void FilterByActiveStatus()
    {
        homeObject = new HomePage(driver);
        homeObject.CreateSellingScheme();
        sellingSchemeListObject = new SellingSchemeListPage(driver);
        sellingSchemeListObject.FilterClick();
        sellingSchemeListObject.FilterByStatus();
    }

    @Test(priority=4)
    public void ClearFilterSearchByStatus()
    {
        sellingSchemeListObject = new SellingSchemeListPage(driver);
        sellingSchemeListObject.ClearSearch();
    }

    @Test(priority=5)
    public void SearchWithSellingNameNotExist()
    {
        homeObject = new HomePage(driver);
        homeObject.CreateSellingScheme();
        sellingSchemeListObject = new SellingSchemeListPage(driver);
        sellingSchemeListObject.FilterClick();
        sellingSchemeListObject.FilterBySellingName("bbbbbbbb");
        Assert.assertTrue(sellingSchemeListObject.noDataFoundText.isDisplayed());

    }

    @Test(priority=6)
    public void CloseFilterDialogue()
    {
        homeObject = new HomePage(driver);
        homeObject.CreateSellingScheme();
        sellingSchemeListObject = new SellingSchemeListPage(driver);
        sellingSchemeListObject.FilterClick();
        sellingSchemeListObject.CloseFilter();
    }

    @Test(priority=7)
    public void ActiveService() throws AWTException, InterruptedException {
        homeObject = new HomePage(driver);
        homeObject.CreateSellingSch();
        sellingObject = new SellingSchemePage(driver);
        sellingObject.changeProvider("Momkin");
        sellingObject.changeBrand("Etisalat Voucher");
        sellingObject.selectProceed();
        sellingObject.chooseService("ORService");
        sellingObject.chooseSellingBrand("BrandTest");
        sellingObject.chooseSettlement("cons_set");
        sellingObject.chooseWorkflow("VOUCHER");
        sellingObject.fillSchemeName("Voucher Selling", "Voucher Selling");
        sellingObject.createSellingfinal();
        sellingSchemeListObject = new SellingSchemeListPage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,3000)");
        Thread.sleep(3000);
        sellingSchemeListObject.Active();
    }
}
