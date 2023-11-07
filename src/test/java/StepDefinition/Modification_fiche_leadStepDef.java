package StepDefinition;

import org.openqa.selenium.WebDriver;

import Hooks.Setup;
import PartieObject.Changement_statut_leadObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Modification_fiche_leadStepDef {
	      WebDriver driver= Setup.driver;
		 Changement_statut_leadObject changement_lead= new  Changement_statut_leadObject (driver);
	
	@Given("Cliquer sur le menu backoffice1")
	public void cliquer_sur_le_menu_backoffice1() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Cliquer sur le menu répertoire de lead1")
	public void cliquer_sur_le_menu_répertoire_de_lead1() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Cliquer sur le menu Urne des leads2")
	public void cliquer_sur_le_menu_urne_des_leads2() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Cliquer sur le bouton Actions1")
	public void cliquer_sur_le_bouton_actions1() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Cliquer sur le bouton {string}")
	public void cliquer_sur_le_bouton(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Remplir le champ piece carte d'identitée")
	public void remplir_le_champ_piece_carte_d_identitée() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Remplir les champs de l'adresse habitation")
	public void remplir_les_champs_de_l_adresse_habitation() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Cliquer sur le bouton btn_enregistrer")
	public void cliquer_sur_le_bouton_btn_enregistrer() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Vérifier que test ok")
	public void vérifier_que_test_ok() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
