package Run;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(tags ="@tag1"
,features = "src/test/features/PagePrincipal/Ajout_secteur_activitée.feature"
,glue= {"StepDefinition","Hooks"}
,publish = true 
,plugin = {"pretty"
		,"html:target/cucumber-reports.html"
		,"json:target/cucumber-reports"
		,}

,snippets= io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE
,monochrome = true
)

public class Runner {

}
