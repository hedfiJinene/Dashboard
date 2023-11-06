package StepDefinition;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import Hooks.Setup;
import PartieObject.Refus_virementObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Refus_virementStepDef {
	
	WebDriver driver= Setup.driver;
	 Refus_virementObject refus_virement= new Refus_virementObject(driver);
	
	@Given("Cliquer sur le menu Echange")
	public void cliquer_sur_le_menu_echange() {
		refus_virement.cliquer_sur_le_menu_echange();
	    
	}

	@Given("Cliquer sur le menu Virement bancaire1")
	public void cliquer_sur_le_menu_virement_bancaire1() {
		refus_virement.cliquer_sur_le_menu_virement_bancaire1();
	}

	@When("Cliquer sur le menu Transaction en attente1")
	public void cliquer_sur_le_menu_transaction_en_attente1() {
		refus_virement.cliquer_sur_le_menu_transaction_en_attente1();
	}

	@When("Cliquer sur le bouton détails de virement d'un client1")
	public void cliquer_sur_le_bouton_détails_de_virement_d_un_client1() {
		refus_virement.cliquer_sur_le_bouton_détails_de_virement_d_un_client1();
	}

	@When("Cliquer sur le bouton refuser")
	public void cliquer_sur_le_bouton_refuser() {
		refus_virement.cliquer_sur_le_bouton_refuser();
	}

	@Then("Expliquer le motif de refus {string}")
	public void expliquer_le_motif_de_refus(String string) {
	   refus_virement.expliquer_le_motif_de_refus();
	}


	@Then("Cliquer sur enregistrer1")
	public void cliquer_sur_enregistrer1() {
		refus_virement.cliquer_sur_enregistrer1();
	}

	@Then("valider le refus")
	public void valider_le_refus() {
		refus_virement.valider_le_refus();
	}
	@Then("vérifier l'url obtenu {string}")
	public void vérifier_l_url_obtenu(String string) {
		refus_virement.vérifier_l_url_obtenu();
	}
}



