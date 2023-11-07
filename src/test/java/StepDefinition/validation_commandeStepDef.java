package StepDefinition;

import org.openqa.selenium.WebDriver;

import Hooks.Setup;
import PartieObject.validation_commandeObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class validation_commandeStepDef {
	WebDriver driver= Setup.driver;
	 validation_commandeObject vld_cmd= new validation_commandeObject(driver);

@Given("Cliquer sur le menu Dashboard")
public void cliquer_sur_le_menu_dashboard() {
	vld_cmd.cliquer_sur_le_menu_Dashboard();
    
}

@Given("Cliquer sur le menu Echanges1")
public void cliquer_sur_le_menu_echanges1() {
	vld_cmd.cliquer_sur_le_menu_Echanges1();
}

@Given("Cliquer sur le menu Produit Exchanges")
public void cliquer_sur_le_menu_produit_exchanges() {
   vld_cmd.cliquer_sur_le_menu_produit_exchanges();
}

@When("Cliquer sur le menu commandes en attentes")
public void cliquer_sur_le_menu_commandes_en_attentes() {
	vld_cmd.cliquer_sur_le_menu_cmd_en_attente();
}

@When("Cliquer sur le menu Détails")
public void cliquer_sur_le_menu_détails() {
	vld_cmd.cliquer_sur_le_menu_détails();
}

@When("Cliquer sur le bouton provisionner")
public void cliquer_sur_le_bouton_provisionner() {
	vld_cmd.cliquer_sur_le_bouton_provisionner();
}

@Then("Choisir l'option code")
public void choisir_l_option_code() {
	vld_cmd.choisir_loption_code();
}

@Then("Saisir le code")
public void saisir_le_code() {
	vld_cmd.saisir_le_code();
	
}

@Then("Cliquer sur btn registre")
public void cliquer_sur_btn_registre() {
   vld_cmd.cliquer_sur_enregistrer();
}

@Then("cliquer sur oui pour confirmer la validation")
public void cliquer_sur_oui_pour_confirmer_la_validation() {
    vld_cmd.cliquer_sur_oui();
}

@Then("vérifier la validation a été effectuée")
public void vérifier_que_la_validation_est_fait() {
	vld_cmd.vérifier_la_validation_aété_effectuée(); ;
   
}


}
