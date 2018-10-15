package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import factory.BrowseFactory;
import factory.DataProviderFactory;
import pages.HomePage;
import pages.LoginPage;
import utility.Helper;

public class VerifyLoginPageWithSC {
	WebDriver driver;
	ExtentReports report;
	ExtentTest logger;
	
	
	@BeforeMethod
    public void setUp() {
		
		report=new ExtentReports("./reports/loginPageReport.html", false);
		//if the value of extent report is true then report will overwrite
       logger=report.startTest("verify login to amazon");
      driver=	BrowseFactory.getBrowser("chrome");
    	 
    	driver.get(DataProviderFactory.getConfig().getApplicationUrl());
	
    	logger.log(LogStatus.INFO, "application is up and running");
}
	@Test
	public void homePageTest() {
	
	HomePage home=PageFactory.initElements(driver, HomePage.class); 
	String title= home.getApplicationTitle();
	Assert.assertTrue(title.contains("Online"));
	logger.log(LogStatus.PASS,"home page is loaded and verified");
	
	home.clickOnsignInlink();
	
	logger.log(LogStatus.INFO, "click on signout link");
	
	LoginPage login=PageFactory.initElements(driver, LoginPage.class);
	login.loginApplication(DataProviderFactory.getExcel().getData(0, 0, 0),DataProviderFactory.getExcel().getData(0, 0, 1) );
	logger.log(LogStatus.INFO, "login to application");
	
	login.verifyCustomerServiceLink();
	logger.log(LogStatus.PASS, "expected link is present");
	


	} 
	
    @AfterMethod
    public void teardown(ITestResult result)
    {
    	
    	if (result.getStatus()==ITestResult.FAILURE) {
			
    		String path =Helper.captureScreenShot(driver, result.getName());
    		
    		logger.log(LogStatus.FAIL, logger.addScreenCapture(path));
    		
		}
	BrowseFactory.closeBrowser(driver);
	report.endTest(logger);
	report.flush();
    }

}
