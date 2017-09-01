package Configuration;
import java.util.Scanner;
import java.util.logging.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import HomePageSuite.PageHome;
import HomePageSuite.PageHomeLanguages;
import HomePageSuite.PageHomeSocial;

public class TestStart {
	
	protected WebDriver driver =  WebDriverChrome.getDriver();
	
	//Home Page Elements
	protected PageHome pageHome = PageFactory.initElements(driver, PageHome.class);
	protected PageHomeSocial pageHomeS = PageFactory.initElements(driver, PageHomeSocial.class);
	
	
	//Additional classes, like Email page
	protected PageEmail pageEmail =  PageFactory.initElements(driver, PageEmail.class);
	protected PageStartMaster page = PageFactory.initElements(driver, PageStartMaster.class);
	
	
	//Web Driver 
	protected WebDriverChrome webDriver = PageFactory.initElements(driver, WebDriverChrome.class);

	
	protected WebDriverWait wait = new WebDriverWait(driver, 11);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	public Logger log = Logger.getLogger("Log");
	public  Actions action = new Actions(driver);
	
    
  //This test should be running before any other tests, it opens the home page
	@Test(groups = {"homepage"})
	public void openHomePage(){
		
		
		//for running on QA
	    
	         	 
//	    	 driver.get(NamesPages.qaPage);	
//	    	 log.info("Here we are, Home Page on QA");    	 
//	     }
	     
	    //for running on Live
	     
    
		 driver.get(NamesPages.getLivepage());
    	 log.info("Here we are, Home Page on Live");  	
	}
	
	@AfterTest
	public void quitDriver() {
	    driver.quit();
	  }
	
	
}
