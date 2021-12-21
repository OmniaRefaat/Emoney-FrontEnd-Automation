package tests.Commercail.Service;

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

import data.ServiceExcelReader;
import pages.Commercial.CommercialHome.HomePage;
import pages.Commercial.Service.ServicePage;
import tests.Commercail.CommercailHome.TestBase;

public class ServiceTest extends TestBase {
	ServicePage serviceObject;
	HomePage homeObject;
	
	@DataProvider(name="ServiceExcelData")
	public Object [][] ServiceData() throws IOException
	{
		ServiceExcelReader ER = new ServiceExcelReader();
			return ER.getExcelData();
		
	}
	
	@Test(priority=1, alwaysRun = true ,dataProvider="ServiceExcelData")
	public void CreateService(String ArName, String EnName, String ServiceCategory, String ImageName) throws AWTException
	{
		homeObject = new HomePage(driver);
		homeObject.CreateSer();
		homeObject.CreateServ();
		serviceObject = new ServicePage(driver);
		serviceObject.CreateServiceComponent(ArName, EnName);
		serviceObject.changeServiceCategory(ServiceCategory);
		serviceObject.changeGroup();
		String imageName = ImageName;
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
		AssertJUnit.assertTrue(serviceObject.serviceListNameTxtBox.getText().equals("Services"));
	}
	/*
	@Test(priority=2)
	public void CreateSuService() {
		homeObject = new HomePage(driver);
		homeObject.CreateSubSer();
	}
	*/
}
