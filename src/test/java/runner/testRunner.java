package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:/Users/kirti/eclipse-workspace/NumpyNinja_Project/src/test/resources/features/Signin.feature"}
		,glue= {"stepdefinition"},
		//plugin= {"pretty","html:target/cucumber.html"},
				plugin= {"pretty","html:target/cucumber.html",
						
						//"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
		         "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", 
						},
		monochrome = true,
		dryRun = false
		)
public class testRunner {

}
