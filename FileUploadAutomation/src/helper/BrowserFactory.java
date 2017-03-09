package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
static WebDriver driver;
	
	
	public static WebDriver startBrowser(Configuration _config){
		 
		WebDriver driver = null;
		switch(_config.getBrowser()){
		case "firefox":
		System.setProperty("webdriver.gecko.driver", _config.getGeckPath());
		driver = new FirefoxDriver();
		break;
		case "chrome":
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver",_config.getChromePath());
		break;
		case "ie":
		System.setProperty("webdriver.chrome.driver",_config.getIEPath() );
        driver = new InternetExplorerDriver();
		break;
		
		default:
		System.setProperty("webdriver.chrome.driver",_config.getChromePath() );
        driver = new ChromeDriver();	
		
		
	}
		return driver;

	}

}
