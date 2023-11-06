package StepDefinition;

import org.openqa.selenium.WebDriver;

import Hooks.Setup;
import PartieObject.Echange_Object;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Echange_StepDef {
	 WebDriver driver= Setup.driver;
		Echange_Object Valider_Echange= new Echange_Object(driver);
		
		
		
	@Given("Cliquer sur le menu Echanges")
    public void cliquer_sur_le_menu_echanges() {
		Valider_Echange.cliqueEchanges();
	}

	@Given("Cliquer sur le menu Virement bancaire")
	public void cliquer_sur_le_menu_virement_bancaire() {
		Valider_Echange.cliqueVirement_bancaires();
	}
	@Given("Cliquer sur le menu Transaction en attente")
	public void cliquer_sur_le_menu_transaction_en_attente() {
	Valider_Echange.cliquetransaction_attente();   
	}

	@Given("Cliquer sur le bouton détails de virement d'un client")
	public void cliquer_sur_le_bouton_détails_de_virement_d_un_client() {
		Valider_Echange.cliqueDétails();
	}

	@When("Cliquer sur le bouton valider la transaction")
	public void cliquer_sur_le_bouton_valider_la_transaction() {
		Valider_Echange.cliquevalider_boutton();
	}

	@When("Cliquer sur le bouton oui pour confirmer la transaction")
	public void cliquer_sur_le_bouton_oui_pour_confirmer_la_transaction() {
		Valider_Echange.cliqueoui();
	}


}
