package tests.Commercail.CommercailHome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import utilities.Helper;

public class TestBase {

	public static WebDriver driver;

	@BeforeSuite
	@Parameters(("browser"))
	public void startDriver(@Optional("chrome") String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
			driver = new ChromeDriver(); 
			//driver.Chrome(ChromeDriverManager().install());
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"/drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.navigate().to("https://sso.maxab.org/auth/realms/maxab/protocol/openid-connect/auth?client_id=e-money-portal&redirect_uri=https%3A%2F%2Femoney-portal.staging.maxab.org%2Fmessages%2Fmessage-details%2F26&state=c3b17987-6583-4e6a-8ae3-22e132e12663&response_mode=fragment&response_type=code&scope=openid&nonce=e9546b16-7868-488e-8374-2ffee6a23724");
	}


	@AfterSuite
	public void stopDriver()
	{
		//driver.quit();
	}
	
	@AfterMethod
	public void screenshotOnFailure(ITestResult result)
	{
	 if(result.getStatus() == ITestResult.FAILURE)
	 {
		 System.out.println("Failed");
		 System.out.println("Taking Screenshot....");
		 Helper.captureScreenshot(driver, result.getName());
	 }
	 }
	}

