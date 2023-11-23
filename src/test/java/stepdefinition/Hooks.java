package stepdefinition;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import Utilities.ConfigReader;
import Utilities.Helper;

public class Hooks {

	@Before
	public static void setUp() throws Throwable {

		String browser = ConfigReader.getBrowserType();
		System.out.println("Browerser is :" +browser);
		Helper.setUpDriver(browser);
	}
	
	@After
	  public void closeBrowser() {
	  Helper.tearDown();
	  }
	
	
	//    @After
	//    public static void tearDown(Scenario scenario) {
	// 
	//        if(scenario.isFailed()) {
	//            final byte[] screenshot = ((TakesScreenshot) Helper.getDriver()).getScreenshotAs(OutputType.BYTES);
	//            scenario.attach(screenshot, "image/png", scenario.getName()); 
	//        }  
	//         
	//        Helper.tearDown();
	//    }

	/*@Before
	public static void setUp() {

		Helper.setUpDriver();
	}*/

}