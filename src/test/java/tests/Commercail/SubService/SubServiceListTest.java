package tests.Commercail.SubService;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Commercial.CommercialHome.HomePage;
import pages.Commercial.ServiceCategory.ServiceCategoryListPage;
import pages.Commercial.SubService.SubServiceListPage;
import pages.Commercial.SubService.SubServicePage;
import tests.Commercail.CommercailHome.TestBase;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class SubServiceListTest extends TestBase {
    SubServiceListPage subServiceListObject;
    HomePage homeObject;
    SubServicePage createSubServiceObject;
    int min = 10;
    int max = 100;
    int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);

    @Test(priority=1)
    public void FilterSubServiceName() throws InterruptedException {
        homeObject = new HomePage(driver);
        homeObject.CreateSubSer();
        subServiceListObject = new SubServiceListPage(driver);
        subServiceListObject.FilterClick();
        subServiceListObject.FilterBySubService("Service2");
        //brandListObject.ClearSearch();
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        // js.executeScript("scrollBy(0,3000)");
        //Thread.sleep(3000);
        //brandListObject.Active();
    }
    @Test(priority=2)
    public void ClearFilterSearchByName()
    {
        subServiceListObject = new SubServiceListPage(driver);
        subServiceListObject.ClearSearch();
    }

    @Test(priority=3)
    public void FilterByActiveStatus()
    {
        homeObject = new HomePage(driver);
        homeObject.CreateSubSer();
        subServiceListObject = new SubServiceListPage(driver);
        subServiceListObject.FilterClick();
        subServiceListObject.FilterByStatus();
    }

    @Test(priority=4)
    public void ClearFilterSearchByStatus()
    {
        subServiceListObject = new SubServiceListPage(driver);
        subServiceListObject.ClearSearch();
    }
    @Test(priority=5)
    public void SearchWithServiceCategoryNameNotExist()
    {
        homeObject = new HomePage(driver);
        homeObject.CreateSubSer();
        subServiceListObject = new SubServiceListPage(driver);
        subServiceListObject.FilterClick();
        subServiceListObject.FilterBySubService("vvvvvvvvvv");
        Assert.assertTrue(subServiceListObject.noDataFoundText.isDisplayed());

    }

    @Test(priority=6)
    public void CloseFilterDialogue()
    {
        homeObject = new HomePage(driver);
        homeObject.CreateSubSer();
        subServiceListObject = new SubServiceListPage(driver);
        subServiceListObject.FilterClick();
        subServiceListObject.CloseFilter();
    }
    @Test(priority=7)
    public void ActiveSubService() throws AWTException, InterruptedException {
        homeObject = new HomePage(driver);
        homeObject.CreateSubServ();
        SubServicePage subServiceObject = new SubServicePage(driver);
        subServiceObject.CreateSubServiceComponent("testSubSerActiv"+random_int, "testSubSerActiv"+random_int);
        subServiceObject.changeService("service brand");
        String imageName = "1.png";
        String imagePath = System.getProperty("user.dir")+"\\Uploads\\"+imageName;
        WebElement fileUploader = driver.findElement(By.xpath("/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-sub-service/form/mat-card/mat-card-content/div[3]/div/app-upload/div/button"));
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
        WebElement fileSubmit = driver.findElement(By.xpath("/html/body/app-root/app-navigation/mat-sidenav-container/mat-sidenav-content/app-create-sub-service/form/mat-card/mat-card-content/div[4]/div/div/button"));
        fileSubmit.click();
        subServiceListObject = new SubServiceListPage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,3000)");
        Thread.sleep(3000);
        subServiceListObject.Active();
    }
}
