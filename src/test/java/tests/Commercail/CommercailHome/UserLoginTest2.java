package tests.Commercail.CommercailHome;

import org.testng.annotations.Test;

import pages.Commercial.CommercialHome.HomePage;

public class UserLoginTest2 extends TestBase {
	HomePage homeObject;

	@Test()
	public void UserCanLoginSuccessfuly()
	{
		homeObject = new HomePage(driver);
		homeObject.ServiceProvider();
		//Assert.assertTrue(loginObject.profileName.isDisplayed());
		
		
	}
}
