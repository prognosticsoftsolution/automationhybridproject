package testcases;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import factory.BrowseFactory;
import okhttp3.Response;

public class BrokenImage {

	public static void main(String[] args) {

		
		 WebDriver driver;
		 driver=BrowseFactory.getBrowser("chrome");
		
		driver.get("https://www.google.co.in/imghp?hl=en&tab=wi");
		driver.findElement(By.tagName("lst-ib")).click();
		driver.findElement(By.tagName("lst-ib")).sendKeys("testing");
		List imagelist=(List) driver.findElement(By.tagName("img"));
		
	System.out.println(imagelist);
		
	}

}
