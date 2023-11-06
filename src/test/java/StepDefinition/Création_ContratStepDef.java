package StepDefinition;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Hooks.Setup;
import PartieObject.Création_contratObject;


public class Création_ContratStepDef {
	WebDriver driver= Setup.driver;
	Création_contratObject Création_contrat= new Création_contratObject (driver);
	
	@Given("Cliquer sur le menu Backoffice")
	public void cliquer_sur_le_menu_backoffice() {
		Création_contrat.clique_Backoffice();
	    
	}

	@Given("Cliquer sur le sous menu Répertoire leads")
	public void cliquer_sur_le_sous_menu_répertoire_leads() {
		Création_contrat.clique_Leads();
	}

	@Given("Cliquer sur le menu Urne des leads")
	public void cliquer_sur_le_menu_urne_des_leads() {
	   Création_contrat.clique_Leads_cours();
	}

	@When("Cliquer sur le bouton Actions")
	public void cliquer_sur_le_bouton_actions() {
	Création_contrat.clique_actions();
	}

	@When("Cliquer sur le bouton nouveau contrat U_Telecom")
	public void cliquer_sur_le_bouton_nouveau_contrat_u_telecom() {
	    Création_contrat.clique_U_Telecom();
	}
	@When("Naviguer sur Iframe proximus")
	public void naviguer_sur_iframe_proximus() {
		Création_contrat.naviguer_iframe_proximus();
		
		
	}
	@When("Cliquer sur le bouton suivant")
	public void cliquer_sur_le_bouton_suivant() {
		 WebDriverWait wait = new WebDriverWait(driver, 20);
	   wait.until(ExpectedConditions.elementToBeClickable(Création_contrat.suivant)).click();
		Création_contrat.clique_suivant();
	}

	@When("Cliquer sur le pack flex netflix")
	public void cliquer_sur_le_pack_flex_netflix() {
		Création_contrat.clique_pack_flex_netflix();
	}

	@When("Choisir  donné1")
	public void choisir_donné1() {
		Création_contrat.clique_donné1();
	}

	@When("Choisir donné2")
	public void choisir_donné2() {
		Création_contrat.select_donné2();
	}
	@When("Choisir donné3")
	public void choisir_donné3() {
		Création_contrat.select_donné3();
	  
	}
	@When("Cocher l'état_vérification_client")
	public void cocher_l_état_vérification_client() {
	 Création_contrat.cocher_état_client();
	}

	@When("Cliquer sur suivant")
	public void cliquer_sur_suivant() {
		Création_contrat.select_suivant2();
	}

	@Then("Cliquer sur finaliser")
	public void cliquer_sur_finaliser() {
		Création_contrat.cliquer_finaliser();
	
	}

}

