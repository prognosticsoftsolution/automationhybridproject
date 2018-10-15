package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import factory.BrowseFactory;
import factory.DataProviderFactory;
import pages.HomePage;

public class VerifyHomePageTest 
{   
	WebDriver driver;
	@BeforeMethod
    public void setUp() {
    	 driver=	BrowseFactory.getBrowser("chrome");
    	 
    	driver.get(DataProviderFactory.getConfig().getApplicationUrl());
	
}
	@Test
	public void homePageTest() {
	
	HomePage home=PageFactory.initElements(driver, HomePage.class); 
	home.getApplicationTitle();
	
	}
	
    @AfterMethod
    public void teardown()
    {
	BrowseFactory.closeBrowser(driver);
    }
	
	
}
