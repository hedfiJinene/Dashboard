package StepDefinition;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import Hooks.Setup;
import PartieObject.Ajout_secteur_activitéeObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Ajout_secteur_activitéeStepDef {
	WebDriver driver= Setup.driver;
	 Ajout_secteur_activitéeObject ajout_secteur= new Ajout_secteur_activitéeObject (driver);
	 
	
	
		@Given("cliquer sur le menu Echanges")
	public void cliquer_sur_le_menu_echanges() {
	    ajout_secteur.cliquer_sur_menu_echanges();
	}

	@Given("cliquer sur le menu secteur d'activitée")
	public void cliquer_sur_le_menu_secteur_d_activitée() {
		ajout_secteur.cliquer_sur_le_menu_secteur_d_activitée();
	   
	}

	@When("cliquer sur le bouton ajouter")
	public void cliquer_sur_le_bouton_ajouter() {
		ajout_secteur.cliquer_sur_le_bouton_ajouter();
	    
	}

	@When("remplir le champ clé_nom")
	public void remplir_le_champ_clé_nom() {
		ajout_secteur.remplir_le_champ_clé_nom();
	   
	}

	@When("remplir le champ clé_description")
	public void remplir_le_champ_clé_description() {
		ajout_secteur.remplir_le_champ_clé_description();
	
	}

	@Then("cliquer sur le bouton save")
	public void cliquer_sur_le_bouton_save() {
		ajout_secteur.cliquer_sur_le_bouton_save();
	  
	}

	@Then("confirmer l'ajout")
	public void confirmer_l_ajout() {
		ajout_secteur.confirmer_l_ajout();
	   
	}
	@Then("vérifier l'ajout de secteur")
	public void vérifier_lajout_de_secteur(){
	 ajout_secteur.vérifier_l_ajout_de_secteur();

	}

}
