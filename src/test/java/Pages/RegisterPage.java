package Pages;

import java.time.Duration;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {
	
	WebDriver driver;
	
	public  RegisterPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By RegisterClick = By.xpath("//a[@id='referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension']");
	By Givenname = By.xpath("//input[@name='givenName']");
	By Familyname = By.xpath("//input[@name='familyName']");
	By Nextbutton = By.xpath("//button[@id='next-button']");
	By Gender = By.id("gender-field");
	By Birthday = By.xpath("//input[@id='birthdateDay-field']");
	By Birthmonth = By.id("birthdateMonth-field");
	By Birthyear = By.xpath("//input[@id='birthdateYear-field']");
	By Address = By.xpath("//input[@id=\"address1\"]");
	By PatientId = By.xpath("//*[@class=\"patient-header row \"]/div[2]/div/span");
	By Confirm = By.id("submit");
	
	
	public void registerclickOne()
	{
		driver.findElement(RegisterClick).click();
	}
	
	public void givenNameOne() {
		driver.findElement(Givenname).sendKeys("Anand");
		
	}
	public void familyNameOne() {
		driver.findElement(Familyname).sendKeys("Tom");
	}
	public void nextButtonOne() {
		driver.findElement(Nextbutton).click();
	}
	
	public void genderSelectionOne() {
		WebElement gender = driver.findElement(Gender);
	    Select obj = new Select(gender);
	    obj.selectByVisibleText("Male");
	}
	
	public void birthdayOne() {
		driver.findElement(Birthday).sendKeys("26");
	}
	public void birthMonthSelectionOne() {
		WebElement month = driver.findElement(Birthmonth);
	    Select mon = new Select(month);
	    mon.selectByVisibleText("May");
	}
	public void birthyearOne() {
		driver.findElement(Birthyear).sendKeys("2020");
	}
	public void addressOne() {
		 driver.findElement(Address).sendKeys("Pala");
	}
	public void confirmRegistrationOne()
	{
		driver.findElement(Confirm).click();
	}
	
	public void verifyRegistrationOne() {
		
		WebDriverWait wdw=new WebDriverWait(driver,Duration.ofSeconds(20));
		wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"patient-header row \"]/div[2]/div/span")));
				
				boolean patientId =  driver.findElement(By.xpath("//*[@class=\"patient-header row \"]/div[2]/div/span")).isDisplayed();
				Assert.assertTrue(patientId, "Patient Id should generate ");
	}
	
}
