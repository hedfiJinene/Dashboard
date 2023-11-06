package PartieObject;

import java.util.concurrent.TimeUnit;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

import org.openqa.selenium.interactions.Actions;



public class Changement_statut_leadObject {
		static WebDriver driver;
		public Changement_statut_leadObject (WebDriver driver ) {
			Changement_statut_leadObject.driver=driver;
			PageFactory.initElements(driver, this);

}
		//Déclaration des éléments 
		@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div/div/aside/aside/ul/li[2]/div/span")
		public static WebElement backoffice ;
		@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div/div/aside/aside/ul/li[2]/ul/li[2]/a/span")
		public static WebElement répertoire_lead;
		@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div/div/div[1]/main/div/div/div[2]/div/div[2]/div/div/button[2]")
		public static WebElement urne;
		@FindBy(how=How.XPATH, using="//*[@id=\"invoice-list\"]/div[3]/div[2]/div/div/table/tbody/tr[1]/td[10]/button/span[3]/svg")
		public static WebElement action;
		@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div/div/div[1]/main/div/div/div[2]/span[3]/div/button/span[3]")
		public static WebElement nouveau_lead;
		@FindBy(how=How.XPATH, using="/html/body/div[4]/div/div[2]/div/div[2]/form/div[1]/div[1]/div/div/div/div/div[3]/div/div")
		public static WebElement liste_déroulante;
		@FindBy(how=How.XPATH, using="/html/body/div[4]/div[1]/div[2]/div/div[2]/form/div[1]/div[1]/div/div/div/div/div[3]/div/div/span")
		public static WebElement input_field;	

		@FindBy(how=How.XPATH, using="/html/body/div[4]/div[1]/div[2]/div/div[2]/form/div[1]/div[1]/div/div/div/div/div[2]/div")
		public static WebElement option;	
		
		@FindBy(how=How.XPATH, using="/html/body/div[4]/div/div[2]/div/div[2]/form/div[1]/div[2]/div/div/div/div/div[3]/textarea")
		public static WebElement input_raison;		
		
		@FindBy(how=How.XPATH, using="/html/body/div[4]/div/div[2]/div/div[2]/form/div[2]/button[1]")
		public static WebElement enregistrer;
				

		@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div/div/div[1]/main/div/div/div[2]/span[2]/div/button/span[3]")
		public static WebElement maj_btn;
				
		//Déclaration des méthodes
		public void clique_backoffice() {
		backoffice.click();
		}

		public void clique_répertoire_lead() {
		répertoire_lead.click();
		}
		public void clique_urne() {
			urne.click();
		}
		public void clique_action() {
			action.click();
		}
		
		public void clique_nouveau_lead() {
			if(nouveau_lead.getText().equals("New")) {
				nouveau_lead.click();
			}else {
				maj_btn.click();
			}
		}
		
		public void clique_liste_déroulante () {
			liste_déroulante.click();
			
		}
		public void choisir_le_status_en_cours() {
			Robot robot;
			try {
				robot = new Robot();
				robot.keyPress(KeyEvent.VK_DOWN);//Nouveau
				robot.keyRelease(KeyEvent.VK_DOWN);//Nouveau
				robot.keyPress(KeyEvent.VK_DOWN);//SPAM
				robot.keyRelease(KeyEvent.VK_DOWN);//Nouveau
				robot.keyPress(KeyEvent.VK_DOWN);//SPAM
				robot.keyRelease(KeyEvent.VK_DOWN);//Nouveau
				robot.keyPress(KeyEvent.VK_DOWN);//SPAM
				robot.keyPress(KeyEvent.VK_SPACE);//Valider la sélection
			} catch (AWTException e) {	
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

			
			
			//Select select= new Select (liste_déroulante);
			//input_raison.sendKeys("test raison");
			//System.out.println("test 123" + input_field.getText());
			//System.out.println("test option" + option.getText());
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//JavascriptExecutor js = (JavascriptExecutor) driver;
	        //USED TO CLEAR TEXTAREA -> js.executeScript("arguments[0].value = '';", input_raison);
	        

			
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//input_raison.sendKeys("test raison 2");
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//select.selectByVisibleText("En cours");
				//	String new_status = "Spam";
			//if(input_field.isEnabled()) {	
				//input_field.clear();
			//}

			//input_field.sendKeys(new_status);
	
			//System.out.println("test 123" + input_field.getText());
		
			//String new_status = "Spam";
			//input_field.sendKeys(new_status);
			
			
		}
		public void cliquer_enregistrer() {
			enregistrer.click();
			
		}
		public void vérifier_changement_status_lead() {
		Assert.assertEquals("nouveau_lead.getText()", "En cours");

		}	
}