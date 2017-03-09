package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.BasePage;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how = How.CSS,using = "#login_field") WebElement username;
	@FindBy(how = How.CSS,using = "#password") WebElement password;
	@FindBy(how = How.XPATH,using = "//input[@value='Sign in']") WebElement signin;
	@FindBy(how = How.XPATH,using = "//span[text()='kanchana-java-programs']") WebElement repo;
	
	public String login(String uname,String pass){
		
		username.sendKeys(uname);
		password.sendKeys(pass);
		signin.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		return driver.getTitle();
	}
	public String clickRepo(){
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		repo.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver.getTitle();
    }
	
	

}
