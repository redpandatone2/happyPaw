package HomePageSuite;

import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageHomeSocial extends PageHome {
	
	@FindBy (css = ".sg-icon-mewe-yt")
	WebElement youTubeIcon;
	
	@FindBy (css = ".sg-icon-mewe-tw")
	WebElement twitIcon;
	
	@FindBy (css = ".nav-emojione")
	WebElement emojiInfo;
	
	@FindBy (css = ".nav-trademark")
	WebElement yearNow;
	
	public boolean yearNow(){		
		int year = Calendar.getInstance().get(Calendar.YEAR);	
		return yearNow.getText().equals("© "+year+" logo");				
	}
	
	public boolean emojiInfo(){
		return emojiInfo.findElement(By.tagName("a")).getText().equals("Emojione");	
	}
	
	public boolean youTubeIcon(){
		return youTubeIcon.isDisplayed();
	}
	
	public boolean twitIcon(){
		return twitIcon.isDisplayed();
	}

}
