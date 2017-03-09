package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;

public class GitHomePageTest extends BaseTest{
	
	HomePage hp;
	 
	@BeforeClass
	public void beforeClass(){
		
		hp= new HomePage(driver);
		
		 hp = PageFactory.initElements(driver, HomePage.class);

	}
	
	@Test(priority = 1)
	public void clickLogin(){
		
		Assert.assertEquals("https://github.com/login",hp.clickOnSignIn());
		
	}

}