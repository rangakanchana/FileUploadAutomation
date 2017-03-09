package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
public static WebDriver driver;

public WebDriverWait wait;
	
	public BasePage(WebDriver driver){
		
		BasePage.driver = driver;
		this.wait = (new WebDriverWait(driver, 30));
	}

}
