package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import helper.BrowserFactory;
import helper.Configuration;

public abstract class BaseTest {

Configuration config;
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void beforeTest(){
		
	 config = new Configuration();
	
	driver = BrowserFactory.startBrowser(config);
	
	driver.get(config.getUrl());
	
	driver.manage().window().maximize();
		
	}
	@AfterSuite
	public void afterTest(){
		
		driver.close();
	}
}
