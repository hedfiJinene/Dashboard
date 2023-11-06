package PartieObject;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import junit.framework.Assert;

public class LoginObject {
		static WebDriver driver;

		//creation d'un constructeur
		public LoginObject (WebDriver driver ) {
			LoginObject.driver=driver;
			PageFactory.initElements(driver, this);
		}
		//Identification des élements
		@FindBy(how=How.XPATH, using="//*[@id=\"input-3\"]")
		public static WebElement MAIL ;
		@FindBy(how=How.XPATH , using="//*[@id=\"input-5\"]")
		public static WebElement mdp ;
		@FindBy(how=How.XPATH , using="//*[@id=\"app\"]/div/div/div/div/div/div[2]/div/div[3]/form/div/div[2]/button/span[3]")
		public static WebElement login ;
		@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div/div/aside/aside/ul/li[1]/a/span")
		public static WebElement Dashboard;
	
	
	 
	

       //Déclaration des méthodes
	
		public void saisirUrl(String args) {
			driver.navigate().to(args);
		}
	
	public void saisirMail(String arg) {
		MAIL.sendKeys(arg);
	}
	public void saisirMdp(String arg) {
		mdp.sendKeys(arg);
	}
	public void Cliquelogin() {
		login.click();
	}
	public void CliqueDashboard() {
		Dashboard.click();
		
		
	}
	public void Vérifier_URL(String url_attendue) {
		
		String url_attendue1 = "https://test.dashboard.u-smile.app/dashboards/analytics";
	 String url_obtenue = driver.getCurrentUrl();
	   System.out.println("URL obtenue : " + url_obtenue);
	   Assert.assertEquals(url_attendue1, url_obtenue);
	   
		}
			}
	