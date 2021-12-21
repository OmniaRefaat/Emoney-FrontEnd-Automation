package tests.Commercail.SellingScheme;

import java.io.IOException;

import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.WorkflowExcelReader;
import pages.Commercial.CommercialHome.HomePage;
import pages.Commercial.SellingScheme.SellingSchemePage;
import tests.Commercail.CommercailHome.TestBase;

public class SellingSchemeTest extends TestBase {
	SellingSchemePage sellingObject;
	HomePage homeObject;
	
	@DataProvider(name="WorkflowExcelData")
	public Object [][] WorkflowData() throws IOException
	{
		WorkflowExcelReader ER = new WorkflowExcelReader();
			return ER.getExcelData();
		
	}
	@Test(priority=1, alwaysRun = true ,dataProvider="WorkflowExcelData")
	public void CreateSelling(String ProviderName, String BrandName, String ServiceName, String SellingBrand, String SettlementName, String WorkflowName, String SellingArName, String SellingEnName) 
	{
		
		homeObject = new HomePage(driver);
		homeObject.CreateSellingScheme();
		homeObject.CreateSellingSch();
		sellingObject = new SellingSchemePage(driver);
		sellingObject.changeProvider(ProviderName);
		sellingObject.changeBrand(BrandName);
		sellingObject.selectProceed();
		sellingObject.chooseService(ServiceName);
		sellingObject.chooseSellingBrand(SellingBrand);
		sellingObject.chooseSettlement(SettlementName);
		sellingObject.chooseWorkflow(WorkflowName);
		sellingObject.fillSchemeName(SellingArName, SellingEnName);
		sellingObject.createSellingfinal();
		AssertJUnit.assertTrue(sellingObject.sellingListNameTxtBox.getText().equals("Selling Schemes"));
		//sellingObject.ActiveSellingScheme();
		
	}
	
}
