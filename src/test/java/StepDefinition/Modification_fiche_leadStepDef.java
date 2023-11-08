package StepDefinition;
import org.openqa.selenium.WebDriver;
import Hooks.Setup;
import PartieObject.Modification_fiche_leadObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Modification_fiche_leadStepDef {
	      WebDriver driver= Setup.driver;
	      Modification_fiche_leadObject modification_lead= new  Modification_fiche_leadObject (driver);
	
	@Given("Cliquer sur le menu backoffice1")
	public void cliquer_sur_le_menu_backoffice1() {
		modification_lead.clique_backoffice11(); 
	}


	@Given("Cliquer sur le menu répertoire de lead1")
	public void cliquer_sur_le_menu_répertoire_de_lead1() {
	  modification_lead.clique_répertoire_lead1();
	}

	@When("Cliquer sur le menu Urne des leads2")
	public void cliquer_sur_le_menu_urne_des_leads2() {
	  modification_lead.clique_urne();
	}

	@When("Cliquer sur le bouton Actions1")
	public void cliquer_sur_le_bouton_actions1() {
	   modification_lead.clique_action();
	}

	@Then("Cliquer sur le bouton {string}")
	public void cliquer_sur_le_bouton(String string) {
	  modification_lead.clique_mise_à_jour();
	}

	@Then("Remplir le champ piece carte d'identitée")
	public void remplir_le_champ_piece_carte_d_identitée() {
	  modification_lead.saisir_numéro_piece_identitée();
	}

	@Then("Remplir les champs de l'adresse habitation")
	public void remplir_les_champs_de_l_adresse_habitation() {
	 modification_lead.saisir_adresse();
	}

	@Then("Cliquer sur le bouton btn_enregistrer")
	public void cliquer_sur_le_bouton_btn_enregistrer() {
		modification_lead.Cliquer_sur_le_bouton_btn_enregistrer();
	    
	}

    @Then("Vérifier que test ok")
	public void vérifier_que_test_ok() {
    	
	  
	}


}
