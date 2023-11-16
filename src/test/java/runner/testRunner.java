package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:/Users/kirti/eclipse-workspace/NumpyNinja_Project/src/test/resources/features"
		,glue= {"stepdefinition"},
		plugin= {"pretty","html:test_output/login.html"},
		monochrome = true,
		dryRun = false
		)
public class testRunner {

}
