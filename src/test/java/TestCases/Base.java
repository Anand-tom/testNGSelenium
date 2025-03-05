package TestCases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	
	public static WebDriver driver;
	

	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://o2.openmrs.org/openmrs/login.htm");
		driver.manage().window().maximize();
	}
	
	
	@AfterMethod
	public void close() {
		driver.close();
	}	
}
