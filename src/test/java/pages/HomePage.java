package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage
{
	WebDriver driver;
	
	public HomePage(WebDriver ldriver) {
		
		this.driver=ldriver;
	
	}
	@FindBy(xpath="//span[text()='Hello. Sign in']") WebElement signIn;
	@FindBy(xpath="//a[text()='Your Amazon.in']") WebElement Amazonin;
	@FindBy(xpath="//a[text()='Customer Service']") WebElement customerservice;
	@FindBy(xpath="//a[text()='Sell']") WebElement sell;
	@FindBy(xpath="//a[@id='nav-cart']") WebElement mycart;
	
	public void clickOnsignInlink() {
		signIn.click();
	}
	
	public void clickOnMyCart() {
		
	   mycart.click();
	}
	
	public void clickonsell() {
		sell.click();
	}
	
	public void clickOnCustomerservice() {
		customerservice.click();
	}
	
	public void clickonAmazonin(){
		Amazonin.click();
	}
	public String getApplicationTitle()
	{
		
	 String title=driver.getTitle();
	 System.out.println(title);
	return driver.getTitle();

	}
}
