package PartieObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class Echange_Object {
	static WebDriver driver;

	//creation d'un constructeur
	public Echange_Object(WebDriver driver ) {
		Echange_Object.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Identification des éléments
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div/div/aside/aside/ul/li[3]/div")
	public static WebElement Echanges;
	@FindBy (how=How.XPATH, using="//*[@id=\"app\"]/div/div/div/div/aside/aside/ul/li[3]/ul/li[1]/a/span" )
	public static WebElement Virement_bancaires ;
	@FindBy (how=How.XPATH, using="//*[@id=\"app\"]/div/div/div/div/div[1]/main/div/div/div[2]/div/div[2]/div/div/button[1]")
	public static WebElement transaction_attente;

	@FindBy(how=How.XPATH, using="//*[@id=\"invoice-list\"]/div[3]/div[2]/div/div/table/tbody/tr[1]/td[7]/span/button")
	public static WebElement Détails;
	
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div/div/div[1]/main/div/div[1]/div/div/div[2]/div[2]/span[1]/button/span[4]")
	public static WebElement valider_boutton;
	@FindBy(how=How.XPATH, using="/html/body/div[5]/div/div[6]/button[1]")
	public static WebElement oui;
	
	
	// déclaration des méthodes
	public void  cliqueEchanges() {
		Echanges.click();
	}
	public void cliqueVirement_bancaires() {
		Virement_bancaires.click();	 
	}
	public void cliquetransaction_attente() {
		transaction_attente.click();
	}
	public void cliqueDétails (){
		Détails.click();
	}
	public void cliquevalider_boutton() {
		valider_boutton.click();
	}
	public void cliqueoui() {
		oui.click();
	}
   
	
	  
}

