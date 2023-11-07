package PartieObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Modification_fiche_leadObject {
        static WebDriver driver;
		public Modification_fiche_leadObject (WebDriver driver ) {
			Changement_statut_leadObject.driver=driver;
			PageFactory.initElements(driver, this);

}
		//Déclaration des variables
		@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div/div/aside/aside/ul/li[2]/div/span")
		public static WebElement backoffice1 ;
		@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div/div/aside/aside/ul/li[2]/ul/li[2]/a/span")
		public static WebElement répertoire_lead1;
		@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div/div/div[1]/main/div/div/div[2]/div/div[2]/div/div/button[2]")
		public static WebElement urne1;
		@FindBy(how=How.XPATH, using="//*[@id=\"invoice-list\"]/div[3]/div[2]/div/div/table/tbody/tr[1]/td[10]/button/span[3]/svg")
		public static WebElement action;
		@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div/div/div[1]/main/div/div/div[2]/span[2]/div/button/span[3]")
		public static WebElement maj_btn;
		@FindBy(how=How.XPATH, using="/html/body/div[1]/div/div/div/div/div[1]/main/div/div/div[3]/div[2]/form/fieldset[1]/div[1]/div[2]/div/div/div/div[4]/input")
		public static WebElement piece_identitée;
		@FindBy(how=How.XPATH, using="/html/body/div[1]/div/div/div/div/div[1]/main/div/div/div[3]/div[2]/form/fieldset[2]/div[1]/div[1]/div/div/div/div[4]/input")
		public static WebElement adresse;
		@FindBy(how=How.XPATH, using="//html/body/div[1]/div/div/div/div/div[1]/main/div/div/div[3]/div[2]/form/fieldset[2]/div[1]/div[4]/div/div/div/div[4]/input")
		public static WebElement boite; 
}
