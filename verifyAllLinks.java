package HomePageSuite;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import Configuration.NamesPages;
import Configuration.TestStart;

public class verifyAllLinks extends TestStart{
	
	
	// This test find and verifies all links on the page 
	
	
	//Preparations, test code is under this functions
	
	public  List<WebElement> findLinks(WebDriver driver)
	{
		
	 List<WebElement> elementList = new ArrayList<WebElement>();
	 elementList = driver.findElements(By.tagName("a"));
	 elementList.addAll(driver.findElements(By.tagName("img")));
  
	  List<WebElement> finalList = new ArrayList<WebElement>(); 
	  for (WebElement element : elementList)
	  {
		  if(element.getAttribute("href") != null)
		  {
			  finalList.add(element);
		  }		  
	  }	
	  return finalList;
	}
	
	
	  public String isLinkBroken(URL url) throws Exception	  
		{
			String response = "";
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			try 
			{
			    connection.connect();
			    response = connection.getResponseMessage();	        
			    connection.disconnect();
			    return response;	 
			}	 
			catch(Exception exp)	 
			{	 
				return exp.getMessage();	 
			}  			
		}
	  
	  //Test
	
	  @Test (groups = {"homepage"},dependsOnMethods = {"openHomePage"})
	  public  void testLinks() throws Exception {
		  
		  
		  log.info("Opening home page");
		  List<WebElement> allImages = findLinks(driver);    
		  log.info("Total number of links found " + allImages.size());
	 
		  for( WebElement element : allImages){ 
			 try 
	      {
     		log.info("URL: " + element.getAttribute("href")+ " returned " + isLinkBroken(new URL(element.getAttribute("href"))));
		  }
		     catch(Exception exp)
		 {
		     log.warning("At " + element.getAttribute("innerHTML") + " Exception occured -&gt; " + exp.getMessage());	    		
	 
}
	 
}
	 
}
	  
	     //same on Login page 
	      @Test (groups = {"homepage"},dependsOnMethods = {"openHomePage"})
          public  void testLinksLoginPage() throws Exception {
		  
	
	      //opening Homepage/login
	      String url  = driver.getCurrentUrl() + NamesPages.getLoginpage();
	      driver.get(url);
		  webDriver.sleep3();
	      log.info("Opening Login Page");
		  
		  
		  //Finding all links and verifying
		  List<WebElement> allImages = findLinks(driver);    
		  log.info("Total number of links found " + allImages.size());
	 
		  for( WebElement element : allImages){ 
			 try 
	      {
     		log.info("URL: " + element.getAttribute("href")+ " returned " + isLinkBroken(new URL(element.getAttribute("href"))));
		  }
		     catch(Exception exp)
		 {
		     log.warning("At " + element.getAttribute("innerHTML") + " Exception occured -&gt; " + exp.getMessage());	    		
	 
}
	 
}
	 
}
	  
	  
	  @AfterClass
		public void quitDriver() {
		    driver.quit();
		  }
	
}
