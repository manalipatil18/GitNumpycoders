package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import io.cucumber.testng.CucumberOptions;

import Utilities.ConfigReader;
import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

/*@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:/Users/kirti/eclipse-workspace/NumpyNinja_Project/src/test/resources/features/Signin.feature"}
		,glue= {"stepdefinition"},
				//plugin= {"pretty","html:target/cucumber.html"},
				plugin= {"pretty","html:target/cucumber.html",
						//"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
						// "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", 
		},
				monochrome = true,
				dryRun = false
		)*/

@CucumberOptions(
		features = {"C:/Users/kirti/eclipse-workspace/NumpyNinja_Project/src/test/resources/features/Signin.feature"}
		,glue= {"stepdefinition"},
				
				plugin= {"pretty","html:target/cucumber.html",
						"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
						//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)
public class testRunner extends AbstractTestNGCucumberTests {

	@DataProvider(parallel = false)
	public Object[][] scenarios() {
	return super.scenarios();
	}
	@BeforeTest
	@Parameters({ "browser" })
	public void defineBrowser(String browser) throws Throwable { 
		ConfigReader.setBrowserType(browser);
	}
 

}
