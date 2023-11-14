package PartieObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ajout_secteur_activitéeObject {
	static WebDriver driver;
	public Ajout_secteur_activitéeObject (WebDriver driver ) {
		Ajout_secteur_activitéeObject.driver=driver;
		PageFactory.initElements(driver, this);
}
	//Déclarations des variables 
	@FindBy(how=How.XPATH, using="/html/body/div[1]/div/div/div/div/aside/aside/ul/li[1]/a/span")
	public static WebElement dashboard1;
	@FindBy(how=How.XPATH, using="/html/body/div[1]/div/div/div/div/aside/aside/ul/li[3]/div/span")
	public static WebElement échanges;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div/div/aside/aside/ul/li[3]/ul/li[3]/a/span")
	public static WebElement secteur;
	@FindBy(how=How.XPATH, using="//*[@id=\"invoice-list\"]/div[2]/div[2]/span/button")
	public static WebElement ajouter;
	@FindBy(how=How.XPATH, using="/html/body/div[4]/div[1]/div[2]/div/div[3]/div/div/div/form/div[2]/div[2]/div/div/div/div[3]/input")
	public static WebElement cle_nom;
	@FindBy(how=How.XPATH, using="/html/body/div[4]/div[1]/div[2]/div/div[3]/div/div/div[2]/form/div[2]/div[2]/div/div/div/div[3]/input")
	public static WebElement cle_fr;
	@FindBy(how=How.XPATH, using="/html/body/div[4]/div[1]/div[2]/div/div[3]/div/div/div[2]/form/div[3]/div[2]/div/div/div/div[3]/input")
	public static WebElement cle_nl;
	@FindBy(how=How.XPATH, using="/html/body/div[4]/div[1]/div[2]/div/div[3]/div/div/div[2]/form/div[4]/div[2]/div/div/div/div[3]/input")
	public static WebElement cle_en;
	@FindBy(how=How.XPATH, using="/html/body/div[4]/div[1]/div[2]/div/div[3]/div/div/div[1]/form/div[3]/div[2]/div/div/div/div[3]/input")
	public static WebElement description;
	@FindBy(how=How.XPATH, using="/html/body/div[4]/div[1]/div[2]/div/div[3]/div/div/div[2]/form/div[2]/div[2]/div/div/div/div[3]/textarea")
	public static WebElement descp_fr;
	@FindBy(how=How.XPATH, using="/html/body/div[4]/div[1]/div[2]/div/div[3]/div/div/div[2]/form/div[3]/div[2]/div/div/div/div[3]/textarea")
	public static WebElement descp_nl;
	@FindBy(how=How.XPATH, using="//html/body/div[4]/div[1]/div[2]/div/div[3]/div/div/div[2]/form/div[4]/div[2]/div/div/div/div[3]/textarea") 
	public static WebElement descp_en;
	@FindBy(how=How.XPATH, using="/html/body/div[4]/div[1]/div[2]/div/div[4]/button[1]")
	public static WebElement save;
	@FindBy(how=How.XPATH, using="/html/body/div[5]/div/div[6]/button[1]")
	public static WebElement enreg;
	

//déclaration des méthodes 
    public void cliquer_sur_menu_echanges() {
    	dashboard1.click();
    	échanges.click();
    	
    }
    public void cliquer_sur_le_menu_secteur_d_activitée() {
    secteur.click();
    }
    public void cliquer_sur_le_bouton_ajouter() {
    	ajouter.click();
    }
    public void  remplir_le_champ_clé_nom() {
    	
    	cle_nom.sendKeys("test1_secteur");
    	cle_fr.sendKeys("test1_secteur");
    	cle_nl.sendKeys("test1_secteur");
    	cle_en.sendKeys("test1_secteur");
    	
    }
    public void remplir_le_champ_clé_description() {
    	description.sendKeys("description1_test");
    	descp_fr.sendKeys("description1_test");
    	descp_nl.sendKeys("description1_test");
    	descp_en.sendKeys("description1_test");
    	
    	
    }
    public void cliquer_sur_le_bouton_save() {
    	save.click();
    	
    }
    public void confirmer_l_ajout() {
    	enreg.click();
    	 WebDriverWait wait = new WebDriverWait(driver, 30); // Attendez jusqu'à 30 secondes au maximum
		    wait.until(ExpectedConditions.urlToBe("https://test.dashboard.u-smile.app/activity"));
		    
		    String url_obtenu = driver.getCurrentUrl();
		    System.out.println("URL actuelle : " + url_obtenu);
    }
    public void vérifier_l_ajout_de_secteur() { 
    	String url_obtenu = driver.getCurrentUrl();
  	  String url_attendu = "https://test.dashboard.u-smile.app/activity";
  	     Assert.assertEquals(url_obtenu, url_attendu);
    	
    }
}
    

