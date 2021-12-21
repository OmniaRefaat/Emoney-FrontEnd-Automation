package tests.Commercail.ServiceCategory;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ServiceCategoryExcelReader;

import java.io.IOException;


import pages.Commercial.CommercialHome.HomePage;
import pages.Commercial.ServiceCategory.ServiceCategoryPage;
import tests.Commercail.CommercailHome.TestBase;


public class ServiceCategoryTest extends TestBase {
	ServiceCategoryPage serviceCatObject;
	HomePage homeObject;

	@DataProvider(name="ServiceCatExcelData")
	public Object [][] ServiceCategorData() throws IOException
	{
		ServiceCategoryExcelReader ER = new ServiceCategoryExcelReader();
			return ER.getExcelData();
		
	}

	@Test(priority=1, alwaysRun = true ,dataProvider="ServiceCatExcelData")
	//@Test()
	public void CreateServiceCategory(String ArName, String EnName, String Desc)
	{
		homeObject = new HomePage(driver);
		homeObject.NavigateToServiceProvider();
		homeObject.CreateServiceCategoryObj();
		serviceCatObject = new ServiceCategoryPage(driver);
		serviceCatObject.FillServiceCatData(ArName, EnName, Desc);
		serviceCatObject.ConfirmCreate();
	}
	/*
	@Test(priority=2)
	public void CreateServiceCateg() 
	{
		serviceCatObject = new ServiceCategoryPage(driver);
		
	}
	*/
	
}
