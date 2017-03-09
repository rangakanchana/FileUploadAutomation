package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.RepositoryPage;

public class RepositoryPageTest extends BaseTest{
	
	RepositoryPage rp;
	 
	@BeforeClass
	public void beforeClass(){
		
		rp= new RepositoryPage(driver);
		
		rp = PageFactory.initElements(driver,RepositoryPage.class);
		
	}
	@Test(priority=4)
	public void clickGithubFolder(){
		
		Assert.assertEquals("https://github.com/rangakanchana/kanchana-java-programs/tree/master/Githubprograms", rp.clickGithubFolder());
	}
	@Test(priority=5)
	public void clickSrcCom(){
		
		Assert.assertEquals("https://github.com/rangakanchana/kanchana-java-programs/tree/master/Githubprograms/src/com", rp.clickSrcCom());
	
	}
	@Test(priority=6)
	public void clickArrays(){
		
		Assert.assertEquals("https://github.com/rangakanchana/kanchana-java-programs/tree/master/Githubprograms/src/com/arrays", rp.clickArrays());	
	}
	@Test(priority=7)
	public void clickUploadFiles(){
		
		Assert.assertEquals("Upload files · rangakanchana/kanchana-java-programs", rp.clickUploadFiles());	
	
	}
	@Test(priority=8)
	 public void clickChooseFiles(){
	    	
	   rp.clickChooseFiles(); 	

	    }
	 @Test(priority=9)
	 public void fileUpload(){
	    	
	    	rp.fileUpload();
	    }
	 @Test(priority=10)
	 public void clickCommit(){
		 
		 Assert.assertEquals("https://github.com/rangakanchana/kanchana-java-programs/upload", rp.clickCommitChanges());
	 }

}
