package PartieObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
	
	
	public class Création_contratObject {
		static WebDriver driver;
		public Création_contratObject (WebDriver driver ) {
			Création_contratObject.driver=driver;
			PageFactory.initElements(driver, this);
		}
		//Identification des élements
		@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div/div/aside/aside/ul/li[2]/div/span")
		public static WebElement Backoffice ;
		@FindBy(how=How.XPATH , using="//*[@id=\"app\"]/div/div/div/div/aside/aside/ul/li[2]/ul/li[2]/a")
		public static WebElement Leads ;
		@FindBy(how=How.XPATH , using="//*[@id=\"app\"]/div/div/div/div/div[1]/main/div/div/div[2]/div/div[2]/div/div/button[3]")
		public static WebElement Leads_cours ;
		@FindBy(how=How.XPATH , using="//*[@id=\"invoice-list\"]/div[3]/div[2]/div/div/table/tbody/tr[2]/td[10]/button")
		public static WebElement actions;
		@FindBy(how=How.XPATH , using="//*[@id=\"app\"]/div/div/div/div/div[1]/main/div/div/div[3]/div[2]/fieldset[3]/div/div[1]/div[1]/button")
		public static WebElement U_Telecom;
		@FindBy(how=How.XPATH, using="/html/body/div[4]/div[2]/div/div/iframe")
		public static WebElement iframe_proximus;  
		
	

		
		@FindBy(how=How.XPATH ,using="//*[@id=\"app\"]/div/div/div/div/div/div[3]/div[2]/span/button")
         public static WebElement suivant;
		
		@FindBy(how=How.CSS , using=".wizard-btn")
		public static WebElement pack_flex_netflix;
		@FindBy(how=How.XPATH , using="//*[@id=\"__BVID__124\"")
		public static WebElement donné1;
		@FindBy(how=How.ID, using="//*[@id=\"etatpriseproximus\"]")
		public static WebElement donné2;
		@FindBy(how=How.XPATH, using="//*[@id=\"typeligneproximus\"]")
		public static WebElement donné3;
		@FindBy(how=How.XPATH, using="//*[@id=\"ock\"]")
		public static WebElement état_client;
		@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div/div/div/div[3]/div[2]/span/button")
		public static WebElement suivant2;
		@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div/div/div/div[3]/div[2]/span/button")
		public static WebElement finaliser;
		//Déclaration des méthodes
		public void clique_Backoffice() {
			Backoffice.click();
		}
		public void clique_Leads() {
			Leads.click();
		}
		public void clique_Leads_cours() {
			Leads_cours.click();
			
		}
		public void clique_actions() {
			actions.click();
				}
		public void clique_U_Telecom() {
			U_Telecom.click();
		}  
		public void naviguer_iframe_proximus() {
			 driver.switchTo().frame(iframe_proximus);
		}
		
		
		public void clique_suivant() {
			 WebDriverWait wait = new WebDriverWait(driver, 10);
			   wait.until(ExpectedConditions.elementToBeClickable(suivant)).click();
			suivant.click();
		}
		public void clique_pack_flex_netflix() {
		pack_flex_netflix.click();
}
		public void clique_donné1() {
			donné1.click();
		}
		public void select_donné2() {
			Select select=new Select(donné2);
			select.selectByValue("0");
		}
		public void select_donné3() {
			Select select=new Select(donné3);
			select.selectByValue("0");
		}
		public void cocher_état_client() {
			état_client.click();
		}
		public void select_suivant2() {
			suivant2.click();
		}
		public void  cliquer_finaliser() {
			finaliser.click();
		}
}