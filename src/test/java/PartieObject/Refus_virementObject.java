package PartieObject;
import static org.junit.Assert.assertEquals;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Refus_virementObject {
	
		static WebDriver driver;
		public Refus_virementObject (WebDriver driver ) {
			Refus_virementObject.driver=driver;
			PageFactory.initElements(driver, this);

}
//Déclaration des variables
		@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div/div/aside/aside/ul/li[3]/div")
		public static WebElement Echanges;
		@FindBy (how=How.XPATH, using="//*[@id=\"app\"]/div/div/div/div/aside/aside/ul/li[3]/ul/li[1]/a/span" )
		public static WebElement Virement_bancaires ;
		@FindBy (how=How.XPATH, using="//*[@id=\"app\"]/div/div/div/div/div[1]/main/div/div/div[2]/div/div[2]/div/div/button[1]")
		public static WebElement transaction_attente;
        @FindBy(how=How.XPATH, using="//*[@id=\"invoice-list\"]/div[3]/div[2]/div/div/table/tbody/tr[1]/td[7]/span/button")
		public static WebElement Détails;
		@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div/div/div[1]/main/div/div[1]/div/div/div[2]/div[2]/span[2]/button")
		public static WebElement btn_refuser;
		@FindBy(how=How.XPATH,using="/html/body/div[4]/div/div[2]/div/div[2]/form/div[1]/div/div/div/div/div/div[3]/textarea")
		public static WebElement raison_refus;
		@FindBy(how=How.XPATH, using="/html/body/div[4]/div/div[2]/div/div[2]/form/div[2]/button[1]/span[3]")
		public static WebElement btn_enregistrer;
		@FindBy(how=How.XPATH, using="/html/body/div[5]/div/div[6]/button[1]")
		public static WebElement btn_valider;
		
		
		//Méthodes 
		public void  cliquer_sur_le_menu_echange() {
			Echanges.click();
		}
		public void cliquer_sur_le_menu_virement_bancaire1() {
			Virement_bancaires.click();
		}
		public void cliquer_sur_le_menu_transaction_en_attente1() {
			transaction_attente.click();
			}
		public void cliquer_sur_le_bouton_détails_de_virement_d_un_client1() {
			Détails.click();
			}
		public void cliquer_sur_le_bouton_refuser() {
			btn_refuser.click();
		}
		public void expliquer_le_motif_de_refus() {
		
		raison_refus.sendKeys("refus");
			
			}
		public void cliquer_sur_enregistrer1() {
			btn_enregistrer.click();
		}
		public void valider_le_refus() {
		btn_valider.click();
		 WebDriverWait wait = new WebDriverWait(driver, 30); // Attendez jusqu'à 30 secondes au maximum
		    wait.until(ExpectedConditions.urlToBe("https://test.dashboard.u-smile.app/exchanges"));
		    
		    String url_obtenu = driver.getCurrentUrl();
		    System.out.println("URL actuelle : " + url_obtenu);
		}
			
		public void vérifier_l_url_obtenu() {
	                String url_obtenu = driver.getCurrentUrl();
				  String url_attendu = "https://test.dashboard.u-smile.app/exchanges";
				     Assert.assertEquals(url_obtenu, url_attendu);
				}
			}

