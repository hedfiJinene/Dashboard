package StepDefinition;

import org.openqa.selenium.WebDriver;

import Hooks.Setup;

import PartieObject.Changement_statut_leadObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Changement_statut_lead {
	WebDriver driver= Setup.driver;
	 Changement_statut_leadObject changement_lead= new  Changement_statut_leadObject (driver);
	@Given("Cliquer sur le menu backoffice")
	public void cliquer_sur_le_menu_backoffice() {
		changement_lead.clique_backoffice();
	  
	}

	@Given("Cliquer sur le menu répertoire de lead")
	public void cliquer_sur_le_menu_répertoire_de_lead() {
		changement_lead.clique_répertoire_lead();
	}
	@When("Cliquer sur le menu Urne des leads1")
	public void cliquer_sur_le_menu_urne_des_leads1() {
		changement_lead.clique_urne(); 
	}


	@Then("Cliquer sur le bouton New")
	public void cliquer_sur_le_bouton_new() {
		changement_lead.clique_nouveau_lead();
	}
	@Then("Cliquer sur la liste déroulante status")
	public void cliquer_sur_la_liste_déroulante_status() {
	   changement_lead.clique_liste_déroulante();
	}

	@Then("Choisir le status {string}")
	public void choisir_le_status_en_cours(String string) {
		 changement_lead.choisir_le_status_en_cours();
	}

	
	
	@Then("Cliquer sur le bouton Enregistrer1")
	public void cliquer_sur_le_bouton_enregistrer1() {
	    changement_lead.cliquer_enregistrer();
	}
	@Then("Vérifier le changement de status de lead")
	public void vérifier_le_changement_de_status_de_lead() {
	changement_lead.vérifier_changement_status_lead();
	}



	}


