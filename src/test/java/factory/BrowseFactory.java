package factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dataProvider.ConfigDataProvider;

public class BrowseFactory 
{
 static WebDriver driver;
	public static  WebDriver getBrowser(String browsername) 
	{
	 if(browsername.equalsIgnoreCase("chrome")) {
		 
		 System.setProperty("webdriver.chrome.driver", DataProviderFactory.getConfig().getChromePath());
		 driver=new ChromeDriver();
	 }
	 else if (browsername.equalsIgnoreCase("firefox"))
	 {
		 
		 System.setProperty("webdriver.gecko.driver",  DataProviderFactory.getConfig().getFirefoxPath());
		 driver=new FirefoxDriver();	
	} 
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public static  void closeBrowser(WebDriver ldriver)
	{
		ldriver.quit();
	}
	 
} 
