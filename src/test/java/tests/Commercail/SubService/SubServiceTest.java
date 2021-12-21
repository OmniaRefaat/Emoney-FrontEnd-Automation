package tests.Commercail.SubService;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.SubServiceExcelReader;
import pages.Commercial.CommercialHome.HomePage;
import pages.Commercial.SubService.SubServicePage;
import tests.Commercail.CommercailHome.TestBase;

public class SubServiceTest extends TestBase {
	SubServicePage  subServiceObject;
	HomePage homeObject;
	
	@DataProvider(name="SubServiceExcelData")
	public Object [][] SubServiceData() throws IOException
	{
		SubServiceExcelReader ER = new SubServiceExcelReader();
			return ER.getExcelData();
		
	}
	@Test(priority=1, alwaysRun = true ,dataProvider="SubServiceExcelData")
	public void CreateSubService(String ArName, String EnName, String Service, String ImageName) throws AWTException
	{
		homeObject = new HomePage(driver);
		homeObject.CreateSubSer();
		homeObject.CreateSubServ();
		subServiceObject = new SubServicePage(driver);
		subServiceObject.CreateSubServiceComponent(ArName, EnName);
		subServiceObject.changeService(Service);
		String imageName = ImageName;
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
		AssertJUnit.assertTrue(subServiceObject.subServiceListNameTxtBox.getText().equals("Sub-Service"));
	}
	
	/*
	@Test(priority=2)
	public void CreateSelling()
	{
		homeObject = new HomePage(driver);
		homeObject.CreateSellingScheme();
	}
	*/
}
