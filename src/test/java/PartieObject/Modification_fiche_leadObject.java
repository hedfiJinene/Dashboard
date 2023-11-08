package PartieObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Modification_fiche_leadObject {
        static WebDriver driver;
		public Modification_fiche_leadObject (WebDriver driver ) {
			Modification_fiche_leadObject.driver=driver;
			PageFactory.initElements(driver, this);

}
		//Déclaration des variables
		@FindBy(how=How.XPATH, using="/html/body/div[1]/div/div/div/div/aside/aside/ul/li[1]/a/span")
		public static WebElement dashboard1;
		@FindBy(how=How.XPATH, using="/html/body/div[1]/div/div/div/div/aside/aside/ul/li[2]/div/span")
		public static WebElement backoffice1 ;
		@FindBy(how=How.XPATH, using="/html/body/div[1]/div/div/div/div/aside/aside/ul/li[2]/ul/li[2]")
		public static WebElement répertoire_lead1;
		@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div/div/div[1]/main/div/div/div[2]/div/div[2]/div/div/button[2]")
		public static WebElement urne1;
		@FindBy(how=How.XPATH, using="/html/body/div[1]/div/div/div/div/div[1]/main/div/div/div[3]/div/div[3]/div[2]/div/div/table/tbody/tr[2]/td[10]/button")
		public static WebElement action;
		@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div/div/div[1]/main/div/div/div[2]/span[2]/div/button/span[3]")
		public static WebElement maj_btn;
		@FindBy(how=How.XPATH, using="/html/body/div[1]/div/div/div/div/div[1]/main/div/div/div[3]/div[2]/form/fieldset[1]/div[1]/div[2]/div/div/div/div[4]/input")
		public static WebElement piece_identitée;
		@FindBy(how=How.XPATH, using="/html/body/div[1]/div/div/div/div/div[1]/main/div/div/div[3]/div[2]/form/fieldset[2]/div[1]/div[1]/div/div/div/div[4]/input")
		public static WebElement adresse;
		@FindBy(how=How.XPATH, using="/html/body/div[1]/div/div/div/div/div[1]/main/div/div/div[3]/div[2]/form/fieldset[2]/div[1]/div[2]/div/div/div/div[3]/input")
		public static WebElement numéro;
		@FindBy(how=How.XPATH, using="//html/body/div[1]/div/div/div/div/div[1]/main/div/div/div[3]/div[2]/form/fieldset[2]/div[1]/div[4]/div/div/div/div[4]/input")
		public static WebElement boite; 
		@FindBy(how=How.XPATH, using="/html/body/div[1]/div/div/div/div/div[1]/main/div/div/div[3]/div[2]/form/fieldset[2]/div[1]/div[3]/div/div/div/div[4]/input")
		public static WebElement etage;
		@FindBy(how=How.XPATH, using="/html/body/div[1]/div/div/div/div/div[1]/main/div/div/div[3]/div[2]/form/fieldset[2]/div[1]/div[5]/div/div[1]/div/div[4]/input")
		public static WebElement code_postal;
		@FindBy(how=How.XPATH, using="/html/body/div[5]/div/div[6]/button[1]")
		public static WebElement oui;
		@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/div/div/div[1]/main/div/div/div[2]/span[2]/div/button")
		public static WebElement btn_enrg;
		
		//Déclaration des Méthodes 
		
		public void clique_backoffice11() {
			dashboard1.click();
			backoffice1.click();
			}

			public void clique_répertoire_lead1() {
			répertoire_lead1.click();
			}
			public void clique_urne() {
				urne1.click();
			}
			public void clique_action() {
				action.click();
			}
			public void clique_mise_à_jour() {
				maj_btn.click();
				
			}
			public void saisir_numéro_piece_identitée() {
				piece_identitée.sendKeys("0123456789");
		
}
			public void saisir_adresse (){
				adresse.sendKeys("adresse_test");
				numéro.sendKeys("10");
				etage.sendKeys("2");
				boite.sendKeys("10");
				code_postal.sendKeys("7000");
			}
			public void Cliquer_sur_le_bouton_btn_enregistrer() {
				btn_enrg.click();
				oui.click();
				
				
}

		
				
			}

