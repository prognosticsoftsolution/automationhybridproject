package pages;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage {
	
	WebDriver driver;  
	
	public LoginPage(WebDriver ldriver) {
		
		this.driver=ldriver;
	}
	@FindBy(id="ap_email") WebElement username;
	@FindBy(id="continue") WebElement continuee;
	@FindBy(id="ap_password") WebElement password;
	@FindBy(id="signInSubmit")WebElement submit; 
	
	By customerservice=By.xpath("//a[text()='Customer Service']");

	
	public void loginApplication(String user,String pass) {
		
		username.sendKeys(user);
		continuee.click();
		password.sendKeys(pass);
		submit.click();
		
		
	}
	 public void verifyCustomerServiceLink() {
		 
		 WebDriverWait wait= new WebDriverWait(driver, 20);
		 WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(customerservice));
		 String actual=ele.getText();
		 Assert.assertEquals(actual, "Customer Service");
		 
	 
	 }
	
}
