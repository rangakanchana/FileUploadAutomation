package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.BasePage;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(how=How.XPATH,using ="//a[text()='Sign in']") WebElement signin;
	
	public String clickOnSignIn(){
		
		signin.click();
		
		return driver.getCurrentUrl();
	}

}
