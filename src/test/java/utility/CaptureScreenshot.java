package utility;

import java.io.File;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import factory.BrowseFactory;

public class CaptureScreenshot {
	
	static WebDriver driver;
	
	@Test
	public static void captureScreenShot() {
		
		driver=BrowseFactory.getBrowser("chrome");
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		
	}

}
