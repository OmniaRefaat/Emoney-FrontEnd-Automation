package tests.Commercail.SellingScheme;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Commercial.CommercialHome.HomePage;
import pages.Commercial.SellingScheme.EditSellingSchemePage;
import pages.Commercial.SellingScheme.SellingSchemePage;
import tests.Commercail.CommercailHome.TestBase;

public class EditSellingSchemeTest extends TestBase {
    HomePage homeObject;
    SellingSchemePage sellingObject;
    EditSellingSchemePage editSellingObject;

    @Test()
    public void EditWorkflow() throws InterruptedException {
        homeObject = new HomePage(driver);
        homeObject.CreateSellingScheme();
        sellingObject = new SellingSchemePage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,5000)");
        Thread.sleep(3000);
        sellingObject.NavigateToEdit();
        editSellingObject = new EditSellingSchemePage(driver);
        editSellingObject.Editflow("full");
        js.executeScript("scrollBy(5000,8000)");
        Thread.sleep(3000);
        editSellingObject.UpdateButton();
        js.executeScript("scrollBy(0,3000)");
        Thread.sleep(3000);
        Assert.assertEquals(editSellingObject.workflowTxt.getText(), "Full Bill Payment");

    }

    @Test()
    public void EditSettlement() throws InterruptedException {
        homeObject = new HomePage(driver);
        homeObject.CreateSellingScheme();
        sellingObject = new SellingSchemePage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,5000)");
        Thread.sleep(3000);
        sellingObject.NavigateToEdit();
        editSellingObject = new EditSellingSchemePage(driver);
        editSellingObject.EditSet("Electricity");
        js.executeScript("scrollBy(5000,8000)");
        Thread.sleep(3000);
        editSellingObject.UpdateButton();
        js.executeScript("scrollBy(0,3000)");
        Thread.sleep(3000);
        editSellingObject.SellingDetails();
        Assert.assertEquals(editSellingObject.settlementNameTxt.getText(), "Electricity");
    }



}
