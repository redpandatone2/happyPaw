package HomePageSuite;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import Configuration.TestStart;

public class TestHomePage8Languages extends TestStart{
	
  //Spanish
	@Test(groups = {"homepage"},dependsOnMethods = {"openHomePage"})
	public void verEs(){
		
		wait.until(ExpectedConditions.visibilityOf(pageHome.getSignUp()));
        pageHomeL.espanol();
        webDriver.sleep1();
      
        if (
        		pageHomeL.textEs() &&
            pageHomeL.textEs2()){
			log.info("Espanol is ok");
		}
		else{
			log.warning("ESPANOL PAGE IS NOT OK");
		}
	}

//Portugese
	@Test(groups = {"homepage"},dependsOnMethods = {"verEs"})
	public void verP(){
		
		wait.until(ExpectedConditions.visibilityOf(pageHome.getSignUp()));
		pageHomeL.portugues();
		webDriver.sleep1();
      
        if (pageHomeL.textP() &&
            pageHomeL.textP2()){
			log.info("Portugese is ok");
		}
		else{
			log.warning("PORTUGESE PAGE IS NOT OK");
			
			
		}
	}
  
	//German
	@Test(groups = {"homepage"},dependsOnMethods = {"verP"})
	public void verD(){
		
		wait.until(ExpectedConditions.visibilityOf(pageHome.getSignUp()));
        pageHomeL.deutsch();
        webDriver.sleep1();
      
        if (pageHomeL.textD() &&
            pageHomeL.textD2()){
			log.info("Deutsch is ok");
		}
		else{
			log.warning("DEUTSCH PAGE IS NOT OK");
			
			//Debugging 
			//log.info(pageHomeL.textContent());
			//log.info(pageHomeL.text2Content());
		}
	}
	
  //French
	@Test(groups = {"homepage"},dependsOnMethods = {"verD"})
	public void verF(){
		
		wait.until(ExpectedConditions.visibilityOf(pageHome.getSignUp()));
        pageHomeL.francias();
        webDriver.sleep1();
        
        if (pageHomeL.textF() &&
            pageHomeL.textF2()){
			log.info("Francias is ok");
		}
		else{
			log.warning("FRANCIAS PAGE IS NOT OK");
		}
	}
	
  //Japanese
	@Test(groups = {"homepage"},dependsOnMethods = {"verF"})
	public void verJ(){
	
		wait.until(ExpectedConditions.visibilityOf(pageHome.getSignUp()));
        pageHomeL.japanese();
        webDriver.sleep1();
        
        if (pageHomeL.textJ() &&
            pageHomeL.textJ2()){
			log.info("Jananese is ok");
		}
		else{
			log.warning("JAPANESE PAGE IS NOT OK");
		}
	}
	
  
  //Arabic
	@Test(groups = {"homepage"},dependsOnMethods = {"verJ"})
	public void verA(){
	
		wait.until(ExpectedConditions.visibilityOf(pageHome.getSignUp()));
        pageHomeL.arabic();
        webDriver.sleep1();
        
        if (pageHomeL.textA() &&
            pageHomeL.textA2()){
			log.info("Arabic is ok");
		}
		else{
			log.warning("ARABIC PAGE IS NOT OK");
		}
	}
	
	@AfterClass
	public void quitDriver() {
	    driver.quit();
	  }
	
	
	
}
