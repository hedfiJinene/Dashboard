package StepDefinition;

import org.openqa.selenium.WebDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Console;

import Hooks.Setup;
import PartieObject.LoginObject;
import io.cucumber.java.en.*;
import junit.framework.Assert;

public class LoginStepDef {
	  WebDriver driver= Setup.driver;
	LoginObject connecter= new LoginObject(driver);
	
	@Given("Saisir le lien {string}")
	public void saisir_le_lien(String string) {
		connecter.saisirUrl(string);
	}

	@When("Saisir E-mail {string}")
	public void saisir_e_mail(String string) {
		connecter.saisirMail(string);
	    
	}

	@When("Saisir le mot de passe1 {string}")
	public void saisir_le_mot_de_passe1(String string) {
		connecter.saisirMdp(string);
	}

	@When("Cliquer sur le bouton login.login")
	public void cliquer_sur_le_bouton_login_login() {
	connecter.Cliquelogin();
	}
		

@When("Cliquer sur le bouton Dashboard")
public void cliquer_sur_le_bouton_dashboard() {
	 connecter.CliqueDashboard();
}

    
	@Then("Vérifier l'url obtenue {string}")
	public void vérifier_l_url_obtenue(String string) {
		 
	connecter.Vérifier_URL("url_obtenue"); 
	  
	}
	}
 
  
	  
  