package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginPageTest extends BaseTest{
	
	LoginPage lp;
	 
	@BeforeClass
	public void beforeClass(){
		
		lp= new LoginPage(driver);
		
		lp = PageFactory.initElements(driver, LoginPage.class);
		
		
	}
	@Test(priority=2)
	public void login(){
		
		Assert.assertEquals("GitHub", lp.login("rangakanchana@gmail.com", "Bikshu25"));
	}
    @Test(priority=3)
	public void clickRepo(){
		
		Assert.assertEquals("rangakanchana/kanchana-java-programs", lp.clickRepo());

	}
}
