package stepdefinition;


import Utilities.Helper;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Datastructure;


public class DataStructuresPage extends Bclass {
//	WebDriver chromedriver = null;
//	Datastructure fromDSjava;

@Given("User is logged in and on Home Page")
public void user_is_logged_in_and_on_home_page() {
	
//	chromedriver = new ChromeDriver();
//    chromedriver.manage().window().maximize();
//	chromedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	chromedriver.get("https://dsportalapp.herokuapp.com/home"); 
//	chromedriver.findElement(By.xpath(("//a[text()='Sign in']"))).click();
	fromDSjava = new Datastructure (Helper.getDriver());
	Helper.openPage();
	Helper.ValidLogin();
	

}

@When("User clicks on Get started button")
public void user_clicks_on_get_started_button() {
	//fromDSjava = new Datastructure(chromedriver);
	///fromDSjava.getstartedbutton();
	Helper.GetStartedbttn();
}

@Then("User is on DataStructures Intro page")
public void user_is_on_data_structures_intro_page() {
	fromDSjava.OnDSpage();
}

@And("User clicks Time Complexity")
public void user_clicks_time_complexity() {
	
	fromDSjava.TimeComplexityBtn();
}

@Then("user gets into time Complexity page of DS")
public void user_gets_into_time_complexity_page_of_ds() {
	fromDSjava = new Datastructure (Helper.getDriver());
	fromDSjava.OnTCpage();
}



@When("User clicks on try me button")
public void user_clicks_on_try_me_button() {
    Helper.Tryherebttn();
}

@Then("User lands on tryEditor page")
public void user_lands_on_try_editor_page() {
	fromDSjava = new Datastructure (Helper.getDriver());
    fromDSjava.onTryeditorpage();
}

@When("User enters invalid code to run on editor")
public void user_enters_invalid_code_to_run_on_editor(DataTable table) throws InterruptedException {
	fromDSjava.enterinvalidcode(table);
}

@And("User clicks Run to execute code")
public void user_clicks_run_to_execute_code() throws InterruptedException {
    Helper.RunBtn();
}

@Then("User gets a error message and dismisses it")
public void user_gets_a_error_message_and_dismisses_it() throws InterruptedException {
	fromDSjava.InValidOutputmessage();
}

@Given("User is on tryEditor page")
public void user_is_on_try_editor_page() {
	fromDSjava = new Datastructure (Helper.getDriver());
     Helper.NavBack();
     Helper.Tryherebttn();
}

@When("User enters python code to run on editor")
public void user_enters_python_code_to_run_on_editor(DataTable table1) throws InterruptedException {
	
	fromDSjava.enterpythoncode(table1);
}


@Then("User gets a valid output")
public void user_gets_a_valid_output() {
	fromDSjava.ValidOutput();
}

@Given("user gets back on time Complexity page of DS")
public void user_gets_back_on_time_complexity_page_of_ds() {
	fromDSjava = new Datastructure (Helper.getDriver());
    Helper.NavBack();
    fromDSjava.OnTCpage();
}

@When("User clicks Practice Questions button")
public void user_clicks_practice_questions_button() {
	fromDSjava.PracticeQuesBtn();
}

@And("user gets into Practice Questions of DS")
public void user_gets_into_practice_questions_of_ds() {
	fromDSjava.OnPQpage();
}

@Then("user navigates back and clicks signs out")
public void user_navigates_back_and_clicks_signs_out() {
	Helper.NavBack();
	Helper.SignOutBtn();
    }



}
