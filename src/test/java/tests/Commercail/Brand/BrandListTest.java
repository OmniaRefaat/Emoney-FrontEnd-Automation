package tests.Commercail.Brand;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Commercial.Brands.BrandListPage;
import pages.Commercial.Brands.BrandPage;
import pages.Commercial.CommercialHome.HomePage;
import pages.Commercial.ServiceCategory.ServiceCategoryListPage;
import tests.Commercail.CommercailHome.TestBase;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class BrandListTest extends TestBase {
    BrandListPage brandListObject;
    HomePage homeObject;
    BrandPage createbrandObject;
    int min = 10;
    int max = 100;
    int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);

    @Test(priority=1)
    public void FilterByBrandName() throws InterruptedException {
        homeObject = new HomePage(driver);
        homeObject.OpenBrandPage();
        brandListObject = new BrandListPage(driver);
        brandListObject.FilterClick();
        brandListObject.FilterByBrand("testtttttttt");
        //brandListObject.ClearSearch();
        //JavascriptExecutor js = (JavascriptExecutor) driver;
       // js.executeScript("scrollBy(0,3000)");
        //Thread.sleep(3000);
        //brandListObject.Active();
    }

    @Test(priority=2)
    public void ClearFilterSearchByName()
    {
        brandListObject = new BrandListPage(driver);
        brandListObject.ClearSearch();
    }

    @Test(priority=3)
    public void FilterByActiveStatus()
    {
        homeObject = new HomePage(driver);
        homeObject.OpenBrandPage();
        brandListObject = new BrandListPage(driver);
        brandListObject.FilterClick();
        brandListObject.FilterByStatus();
    }

    @Test(priority=4)
    public void ClearFilterSearchByStatus()
    {
        brandListObject = new BrandListPage(driver);
        brandListObject.ClearSearch();
    }

    @Test(priority=5)
    public void SearchWithBrandNameNotExist()
    {
        homeObject = new HomePage(driver);
        homeObject.OpenBrandPage();
        brandListObject = new BrandListPage(driver);
        brandListObject.FilterClick();
        brandListObject.FilterByBrand("VVVVVVVV");
        Assert.assertTrue(brandListObject.noDataFoundText.isDisplayed());

    }

    @Test(priority=6)
    public void CloseFilterDialogue()
    {
        homeObject = new HomePage(driver);
        homeObject.OpenBrandPage();
        brandListObject = new BrandListPage(driver);
        brandListObject.FilterClick();
        brandListObject.CloseFilter();
    }

    @Test(priority=7)
    public void ActiveBrand() throws AWTException, InterruptedException {
        homeObject = new HomePage(driver);
        homeObject.CreateBrand();
        BrandPage createbrandObject = new BrandPage(driver);
        createbrandObject.CreateBrand("testBrandActivation"+random_int, "testBrandActivation"+random_int);
        String imageName = "1.png";
        String imagePath = System.getProperty("user.dir")+"\\Uploads\\"+imageName;

        WebElement fileUploader = driver.findElement(By.xpath("/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-brand/form/mat-card/mat-card-content/div[2]/div/app-upload/div/button/span[1]"));
        fileUploader.click();
        Robot robot = new Robot();
        StringSelection imageSelection = new StringSelection(imagePath);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(imageSelection, null);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        WebElement fileSubmit = driver.findElement(By.xpath("/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-brand/form/mat-card/mat-card-content/div[3]/div/div/button"));
        fileSubmit.click();
        brandListObject = new BrandListPage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,3000)");
        Thread.sleep(3000);
        brandListObject.Active();
    }


}
