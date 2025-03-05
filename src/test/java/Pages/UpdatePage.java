package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class UpdatePage {
	
WebDriver driver;
	
	public  UpdatePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By FindPatientClick = By.xpath("//a[@id='coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension']");
	By SearchByName = By.xpath("//input[@placeholder='Search by ID or Name']");
	By ResultGrid = By.xpath("//*[@id='patient-search-results-table_wrapper']/table/tbody/tr[1]");
	By Edit = By.xpath("//span[@id='edit-patient-demographics']");
	By givenName = By.xpath("//input[@name='givenName']");
	By saveButton = By.xpath("//a[@id='save-form']");
	By confirmEdit = By.xpath("//button[@id='registration-submit']");
	By personalGivenName = By.xpath("//span[@class='PersonName-givenName']");
	
	
	public void findpatientClicks()
	{
		driver.findElement(FindPatientClick).click();
	}
	
	public void searchByName() {
		driver.findElement(SearchByName).sendKeys("Anand");
	}
	
	public void selectSearchPatient() {
		WebElement moveMouse=driver.findElement(ResultGrid);
		Actions ac=new Actions(driver);
		ac.moveToElement(moveMouse).click().perform();
	}
	
	public void editClicks() {
		driver.findElement(Edit).click();
	}
	
	public void updateNameandSave() {
		 driver.findElement(givenName).clear();
		    driver.findElement(givenName).sendKeys("AnandBabu");
		    driver.findElement(saveButton).click();
	}
	
	public void confirmUpdate() {
		driver.findElement(confirmEdit).click();
	}
	
	public void verifyUpdateName() {
		
		WebDriverWait wdw=new WebDriverWait(driver,Duration.ofSeconds(20));
		wdw.until(ExpectedConditions.visibilityOfElementLocated(personalGivenName));
				
				WebElement actual_updated_name =  driver.findElement(personalGivenName);
				Assert.assertEquals(actual_updated_name.getText(), "AnandBabu");
	}
	

}
