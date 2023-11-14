package Hooks;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.cucumber.core.cli.Main;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Setup {
	public static WebDriver driver;
	@Before
	public void initial() {
		driver = DriverManager.getDriver();
	}
	public class RunCucumberTests {
	    public void main(String[] args) {
	        Main.run(args, Thread.currentThread().getContextClassLoader());
	    }
	}
	@AfterStep
	public void TakeScreenshot(Scenario scenario) {
		
	final byte [] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	scenario.attach(screenshot,"image/png","image" );
	}
	
	@After 
	public void terminal () {
		
	}

}

