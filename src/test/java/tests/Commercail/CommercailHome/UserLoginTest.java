package tests.Commercail.CommercailHome;

import data.ExcelReader;
import data.UserExcelReader;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.Commercial.CommercialHome.LoginPage;

import java.io.IOException;

public class UserLoginTest extends TestBase {
	LoginPage loginObject;

	@DataProvider(name="ExcelData")
	public Object [][] UserData() throws IOException
	{
		UserExcelReader ER = new UserExcelReader();
		return ER.getExcelData();

	}

	@Test(priority=1, alwaysRun = true ,dataProvider="ExcelData")
	public void UserCanLoginSuccessfuly(String userName, String pass)
	{
		loginObject = new LoginPage(driver);
		loginObject.UserLogin(userName, pass);
		Assert.assertTrue(loginObject.profileName.isDisplayed());
		//Assert.assertTrue(loginObject.profileName.getText().equals(" omnia refaat "));
		//System.out.println(loginObject.profileName.getText());
		
	}
}
