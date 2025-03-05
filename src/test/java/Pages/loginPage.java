package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class loginPage {

	WebDriver driver;
	
	public  loginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By username =By.id("username");
	By password = By.id("password");
	By location = By.xpath("//li[@id='Inpatient Ward']");
    By loginButton = By.id("loginButton");
    By invalidMessage = By.id("error-message");
    

	

	public void enterUsername(String Name) {
		driver.findElement(username).sendKeys(Name);
}
	
	public void enterPassword(String Pwd) {
		driver.findElement(password).sendKeys(Pwd);
}
	
	public void selectLocation() {
		driver.findElement(location).click();
}

	public void signIn() {
		driver.findElement(loginButton).click();
}

	public void InValidMessage()
	{
		WebElement invalidmsg =driver.findElement(invalidMessage);
		 Assert.assertEquals(invalidmsg.getText(),"Invalid username/password. Please try again.");
	}

}
