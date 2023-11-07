package PartieObject;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;




public class validation_commandeObject {
	static WebDriver driver;
	public validation_commandeObject (WebDriver driver ) {
		validation_commandeObject.driver=driver;
		PageFactory.initElements(driver, this);
}
	//Déclaration des variables
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div/div/aside/aside/ul/li[1]/a")
	public static WebElement Dashboard;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div/div/aside/aside/ul/li[3]/div/span")
	public static WebElement Echanges1;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div/div/aside/aside/ul/li[3]/ul/li[2]/a/span")
	public static WebElement Produit_exchanges;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div/div/div[1]/main/div/div/div[3]/div/div[2]/div/div/button[1]/span[3]")
	public static WebElement cmd_att;
	@FindBy(how=How.XPATH, using="//*[@id=\"invoice-list\"]/div[3]/div[2]/div/div/table/tbody/tr[1]/td[8]/span/button")
	public static WebElement détails;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div/div/div[1]/main/div/div[1]/div/div/div[2]/div[2]/span[1]/button")
	public static WebElement btn_provisionner; 
	@FindBy(how=How.XPATH, using="/html/body/div[4]/div/div[2]/div/div[2]/form/div[1]/div/div/div/div/div/div[3]/div")
	public static WebElement dropdown;
	 @FindBy(how=How.XPATH, using="/html/body/div[4]/div/div[2]/div/div[2]/form/div[1]/div[2]/div/div/div/div/div[3]/input") 
	public static WebElement code;
     @FindBy(how=How.XPATH, using="/html/body/div[4]/div/div[2]/div/div[2]/form/div[2]/button[1]")
     public static WebElement btn_registre;
     @FindBy(how=How.XPATH, using="/html/body/div[5]/div/div[6]/button[1]")
     public static WebElement btn_oui;
	 //Méthodes
		public void  cliquer_sur_le_menu_Dashboard() {
			Dashboard.click();
}
		public void cliquer_sur_le_menu_Echanges1() {
			Echanges1.click();
		}
		public void cliquer_sur_le_menu_produit_exchanges() {
			Produit_exchanges.click();
		
}
		public void cliquer_sur_le_menu_cmd_en_attente() {
			cmd_att.click();
			
		}
		public void cliquer_sur_le_menu_détails() {
			détails.click();
			
		}
		public void cliquer_sur_le_bouton_provisionner() {
			btn_provisionner.click();
			dropdown.click();
			
			
		}
		//public void cliquer_sur_la_liste_déroulante() {
			//dropdown.click();
		//}
		public void choisir_loption_code()	{
			Robot robot;
			try {
				robot = new Robot();
				robot.keyPress(KeyEvent.VK_DOWN);
			    robot.keyRelease(KeyEvent.VK_DOWN);
			    robot.keyPress(KeyEvent.VK_SPACE);//Valider la sélection
			} catch (AWTException e) {	
				
			e.printStackTrace();
			
			    
	}
		}
		public void saisir_le_code() {
		// WebDriverWait wait = new WebDriverWait(driver, 30);
		 //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/form/div[1]/div[2]/div/div/div[1]/div/div[3]/input")));
		//WebElement codeElement = wait.until(ExpectedConditions.elementToBeClickable(code));
         code.sendKeys("abcd");
		}


   
		public void cliquer_sur_enregistrer() {
	
			btn_registre.click();
}
         public void cliquer_sur_oui() {
           btn_oui.click();

  		 WebDriverWait wait = new WebDriverWait(driver, 30); // Attendez jusqu'à 30 secondes au maximum
  		    wait.until(ExpectedConditions.urlToBe("https://test.dashboard.u-smile.app/procurement"));
  		    String url_obtenu = driver.getCurrentUrl();
  		    System.out.println("URL actuelle : " + url_obtenu);

		 }
         public void vérifier_la_validation_aété_effectuée() {
        	 String url_obtenu= driver.getCurrentUrl();
        	 String url_attendu="https://test.dashboard.u-smile.app/procurement";
        	 Assert.assertEquals(url_obtenu, url_attendu);
         }
         
}

		

		
