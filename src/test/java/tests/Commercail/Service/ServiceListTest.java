package tests.Commercail.Service;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Commercial.CommercialHome.HomePage;
import pages.Commercial.Service.ServiceListPage;
import pages.Commercial.Service.ServicePage;
import pages.Commercial.ServiceCategory.ServiceCategoryListPage;
import tests.Commercail.CommercailHome.TestBase;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class ServiceListTest extends TestBase {
    ServiceListPage serviceListObject;
    HomePage homeObject;
    ServicePage serviceObject;
    int min = 10;
    int max = 100;
    int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);

    @Test(priority=1)
    public void FilterServiceName() throws InterruptedException {
        homeObject = new HomePage(driver);
        homeObject.CreateSer();
        serviceListObject = new ServiceListPage(driver);
        serviceListObject.FilterClick();
        serviceListObject.FilterByService("Service2");
    }

    @Test(priority=2)
    public void ClearFilterSearchByName()
    {
        serviceListObject = new ServiceListPage(driver);
        serviceListObject.ClearSearch();
    }

    @Test(priority=3)
    public void FilterByActiveStatus()
    {
        homeObject = new HomePage(driver);
        homeObject.CreateSer();
        serviceListObject = new ServiceListPage(driver);
        serviceListObject.FilterClick();
        serviceListObject.FilterByStatus();
    }

    @Test(priority=4)
    public void ClearFilterSearchByStatus()
    {
        serviceListObject = new ServiceListPage(driver);
        serviceListObject.ClearSearch();
    }


    @Test(priority=5)
    public void SearchWithServiceNameNotExist()
    {
        homeObject = new HomePage(driver);
        homeObject.CreateSer();
        serviceListObject = new ServiceListPage(driver);
        serviceListObject.FilterClick();
        serviceListObject.FilterByService("vvvvvvvvvv");
        Assert.assertTrue(serviceListObject.noDataFoundText.isDisplayed());

    }

    @Test(priority=6)
    public void CloseFilterDialogue()
    {
        homeObject = new HomePage(driver);
        homeObject.CreateSer();
        serviceListObject = new ServiceListPage(driver);
        serviceListObject.FilterClick();
        serviceListObject.CloseFilter();
    }
    @Test(priority=7)
    public void ActiveService() throws AWTException, InterruptedException {
        homeObject = new HomePage(driver);
        homeObject.CreateServ();
        serviceObject = new ServicePage(driver);
        serviceObject.CreateServiceComponent("testServiceActivation"+random_int, "testServiceActivation"+random_int);
        serviceObject.changeServiceCategory("asmaa");
        serviceObject.changeGroup();
        String imageName = "1.png";
        String imagePath = System.getProperty("user.dir")+"\\Uploads\\"+imageName;

        WebElement fileUploader = driver.findElement(By.xpath("/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-service/form/mat-card/mat-card-content/div[4]/div/app-upload/div/button"));
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
        WebElement fileSubmit = driver.findElement(By.xpath("/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-service/form/mat-card/mat-card-content/div[5]/div/div"));
        fileSubmit.click();
        serviceListObject = new ServiceListPage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,3000)");
        Thread.sleep(3000);
        serviceListObject.Active();
    }
}
