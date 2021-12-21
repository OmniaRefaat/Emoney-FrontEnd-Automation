package tests.Commercail.Brand;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ExcelReader;

import org.testng.AssertJUnit;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import pages.Commercial.Brands.BrandPage;
import pages.Commercial.CommercialHome.HomePage;
import tests.Commercail.CommercailHome.TestBase;


public class BrandTest extends TestBase {
	BrandPage brandObject;
	HomePage homeObject;
	
	@DataProvider(name="ExcelData")
	public Object [][] ServiceData() throws IOException
	{
		ExcelReader ER = new ExcelReader();
			return ER.getExcelData();
		
	}

	/*
  @Test()
  public void createBrandSuccessfully()
  {
	  brandObject = new BrandPage(driver);
	  brandObject.CreateBrand("tesssst", "tesssst");
  }
	 */
	
	@Test(priority=1, alwaysRun = true ,dataProvider="ExcelData")
	public void CreateBrand(String ArName, String EnName, String ImageName) throws AWTException
	{
		homeObject = new HomePage(driver);
		homeObject.OpenBrandPage();
		homeObject.CreateBrand();
		brandObject = new BrandPage(driver);
		//brandObject.CreateServiceCategory);
		brandObject.CreateBrand(ArName, EnName);
		String imageName = ImageName;
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
		AssertJUnit.assertTrue(brandObject.brandListNameTxtBox.getText().equals("Brands"));	
		//brandObject.ActiveBrand();
	}
	
	/*

	@Test(priority=2)
	public void ActivateBrand() throws InterruptedException 
	{
		brandObject = new BrandPage(driver);
		//Thread.sleep(10);
		//WebDriverWait(driver, 1000000).until(EC.element_to_be_clickable((By.id("mat-slide-toggle-1-input")))).click();
		//js.executeScript("arguments[0].scrollIntoView(true);", webDriver.findElement(By.id("mat-slide-toggle-1-input")));
		//WebElement element = driver.findElement(By.id("mat-slide-toggle-1-input"));
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		//element.click();
		brandObject.brandActivationBtn.click();
		
		
		//brandObject.activationBtn.click();
	}
	*/
	
	/*
	@Test(priority=2)
	public void CreateService() {
		homeObject = new HomePage(driver);
		homeObject.CreateService();
	}
	*/
	/*
	@Test(priority=2)
	public void CreateSuService() {
		homeObject = new HomePage(driver);
		homeObject.CreateSubSer();
	}
	*/
	
}
