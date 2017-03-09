package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePage;

public class RepositoryPage extends BasePage{

	public RepositoryPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.XPATH,using = "//a[contains(text(),'Githubprograms')]") WebElement githubFolder;
    @FindBy(how = How.XPATH,using = "//a[@href='/rangakanchana/kanchana-java-programs/tree/master/Githubprograms/src/com']")
    WebElement src_com;
    @FindBy(how = How.XPATH,using ="//a[text()='arrays']") WebElement arrays;
    @FindBy(how = How.XPATH,using = "//a[contains(text(),'Upload files')]") WebElement uploadfiles;
    @FindBy(how = How.XPATH,using = "//input[@type='file']")WebElement chooseFiles;
    @FindBy(how = How.XPATH,using = "//button[contains(text(),'Commit changes')]") WebElement commitchanges;
    
   
	
    public String clickGithubFolder(){
    	
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Githubprograms')]")));

        githubFolder.click();
		
    	return driver.getCurrentUrl();

		}
    public String clickSrcCom(){
		
    	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/rangakanchana/kanchana-java-programs/tree/master/Githubprograms/src/com']")));


        src_com.click();

		return driver.getCurrentUrl();
    	
    }
    public String clickArrays(){
		
    	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='arrays']")));


    	arrays.click();
       
    	return driver.getCurrentUrl(); 
    	
    }
    public String clickUploadFiles(){
		
    	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Upload files')]")));

    	uploadfiles.click();

		return driver.getTitle();
    	
    	
    }
    public void clickChooseFiles(){
		
    	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='file']")));

		chooseFiles.click();

    }
    
    public void fileUpload(){
    	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Githubprograms')]")));


    	try {
			Runtime.getRuntime().exec("C:\\Users\\sridhar\\AutoItScripts\\script1(linear search).exe");
		} catch (IOException e) {
			e.getMessage();
		}
    }
    
    public String clickCommitChanges(){
		
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Commit changes')]")));


    	commitchanges.click();
    	
    	return driver.getCurrentUrl();
    	
    	
    }

}
