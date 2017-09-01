package HomePageSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageHomeLanguages extends PageHome {
	
    
   //Header  
    @FindBy (linkText = "Português (Brasil)")
    WebElement portugues;
    
    @FindBy (linkText = "Español")
    WebElement espanol;
    
    @FindBy (linkText = "Français")
    WebElement francias;
    
    @FindBy (linkText = "Deutsch")
    WebElement deutsch;
    
    @FindBy (linkText = "日本語")
    WebElement japanese;
    
    @FindBy (linkText = "English")
    WebElement english;
    
    @FindBy (linkText = "لعربية")
    WebElement arabic;
    
    
    @FindBy (id = "login-fake-btn")
    WebElement logBut;
    
   //Verify elements Espanol
    public boolean textEs(){
    	return logBut.getAttribute("textContent").equals("Inicio de sesión de miembro");
    }
    public boolean textEs2(){
    	//return stalking.getAttribute("textContent").equals("¿Tu red social te vigila?");
    	return header.getAttribute("textContent").equals("Sin anuncios. Sin seguimiento. Sin tonterías.");
    }
    
    
    //Verify elements Porto
    public boolean textP(){
    	return logBut.getAttribute("innerText").equals("Login de Membro");
    }
    public boolean textP2(){
    	//return stalking.getAttribute("textContent").equals("Sua rede social está perseguindo você?");
    	return header.getAttribute("textContent").equals("Sem Propaganda. Sem Rastreamento. Sem Besteira.");
    }
    
    
    //Verify elements Franch
    public boolean textF(){
    	return logBut.getAttribute("textContent").equals("Connexion Membre");
    }
    public boolean textF2(){
    	//return stalking.getAttribute("textContent").equals("Votre réseau social vous harcèle ?");
    	return header.getAttribute("textContent").equals("Pas d’annonces publicitaires. Pas de suivi. Pas de blabla.");
    }
    
    
  //Verify elements Deutsch
    public boolean textD(){
    	return logBut.getAttribute("textContent").equals("Login für Mitglieder");
    }
    public boolean textD2(){
    	//return stalking.getAttribute("textContent").equals("Spionieren dich deine sozialen Netzwerke aus?");
    	return header.getAttribute("textContent").equals("Keine Werbung. Kein Tracking. Kein Mist.");
    }
    
    //Debugging Deutsch
    public String textContent(){
    	return logBut.getAttribute("textContent");
    }
    public String text2Content(){
    	return stalking.getAttribute("textContent");
    }
  
    
    //Verify elements Japanese
    public boolean textJ(){
    	return logBut.getAttribute("textContent").equals("メンバーログイン");
    }
    public boolean textJ2(){
    	//return stalking.getAttribute("textContent").equals("自分のソーシャルメディアサービスでストーキングされていますか？");
    	return header.getAttribute("textContent").equals("広告なし。トラッキングもしません。");
    } 
    
  //Verify elements Arabic
    public boolean textA(){
    	return logBut.getAttribute("textContent").equals("تسجيل دخول الأعضاء");
    }
    public boolean textA2(){
    	
    	return header.getAttribute("textContent").equals("بدون إعلانات. بدون تتبع. بدون إزعاج.");
    }
    
    
    
      
    
   //switchers
    public void portugues(){
    	portugues.click();
    }
    public void espanol(){
    	espanol.click();
    }
    public void francias(){
    	francias.click();
    }
    public void deutsch(){
    	deutsch.click();
    }
    public void japanese(){
    	japanese.click();
    }
    public void english(){
    	english.click();
    }
    public void arabic(){
    	arabic.click();
    }
   

}
