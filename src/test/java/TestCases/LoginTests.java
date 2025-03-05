package TestCases;


import java.io.IOException;



import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.RegisterPage;
import Pages.UpdatePage;
import Pages.afterLoginPage;
import Pages.loginPage;

@Listeners(TestCases.TestListeners.class)
public class LoginTests extends Base {
	
	
	@Test
	public void validCredentialsTest() throws IOException, InterruptedException {

		loginPage lp=new loginPage(driver);
		afterLoginPage validate = new afterLoginPage(driver);
		
			
			lp.enterUsername("admin");
            lp.enterPassword("Admin123");
			lp.selectLocation();
			lp.signIn();
			validate.validMessageOne();
			driver.findElement(By.linkText("Logout")).click();
		}
		

	
	@Test
	public void InvalidCredentialsTest() throws IOException, InterruptedException {

		loginPage lp=new loginPage(driver);
	
		lp.enterUsername("admin");
		lp.enterPassword("Admi4564");
		lp.selectLocation();
		lp.signIn();
		lp.InValidMessage();
	}
	
	@Test
	public void BlankCredentialsTest() throws IOException, InterruptedException {

		loginPage lp=new loginPage(driver);
	
		lp.enterUsername(" ");
		lp.enterPassword(" ");
		lp.selectLocation();
		lp.signIn();
		lp.InValidMessage();
	}
	
	@Test
	public void RegisterPatient() {
		loginPage lp=new loginPage(driver);
		afterLoginPage validate = new afterLoginPage(driver);
		RegisterPage rg = new RegisterPage(driver);
		
		lp.enterUsername("admin");
        lp.enterPassword("Admin123");
		lp.selectLocation();
		lp.signIn();
		validate.validMessageOne();
		rg.registerclickOne();
		rg.givenNameOne();
		rg.familyNameOne();
		rg.nextButtonOne();
		rg.genderSelectionOne();
		rg.nextButtonOne();
		rg.birthdayOne();
		rg.birthMonthSelectionOne();
		rg.birthyearOne();
		rg.nextButtonOne();
		rg.addressOne();
		rg.nextButtonOne();
		rg.nextButtonOne();
		rg.nextButtonOne();
		rg.confirmRegistrationOne();
		rg.verifyRegistrationOne();
		
		
	}
	
	@Test
	public void UpdatePatient()
	{
		loginPage lp=new loginPage(driver);
		afterLoginPage validate = new afterLoginPage(driver);
		UpdatePage up = new UpdatePage(driver);
		
		lp.enterUsername("admin");
        lp.enterPassword("Admin123");
		lp.selectLocation();
		lp.signIn();
		validate.validMessage();
		up.findpatientClicks();
		up.searchByName();
		up.selectSearchPatient();
		up.editClicks();
		up.updateNameandSave();
		up.confirmUpdate();
		up.verifyUpdateName();
		
	}
	


}
