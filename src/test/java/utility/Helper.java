package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {
	
	
	public static String captureScreenShot(WebDriver driver,String screenshotname) {
		
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	
	String destination="D:\\vipool\\newgen\\com.automation.hybrid\\screenshots\\"+screenshotname+System.currentTimeMillis()+".png";
	
	try {
		FileUtils.copyFile(src, new File(destination));
	} catch (IOException e) {

	System.out.println("failed test screenshot"+e.getMessage());
	
	}
	return destination;
	}
	

}
