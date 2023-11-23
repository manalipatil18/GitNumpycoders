package stepdefinition;


import Utilities.Helper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Login;


public class loginPage extends Bclass{	


	@Given("user is on login page")
	public void user_is_on_login_page() {

		fromloginjava = new Login(Helper.getDriver()); 
		Helper.openPage();

	}

	@When("^user enters(.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {

		fromloginjava.enterusername(username);
		fromloginjava.enterpassword(password);
	}

	@And("user clicks on login")
	public void user_clicks_on_login() {

		fromloginjava.clicklogin();
	}

	@Then("Login success window should be displayed")
	public void login_success_window_should_be_displayed() {
		fromloginjava.getsucessmsg();
	}

	@Then("Error message displayed")
	public void error_message_displayed() {

		fromloginjava.getErrMsgUN();
	}

	@Then("Please fill field error message")
	public void please_fill_field_error_message() {
		fromloginjava.plsfillerrmsg();
	}

	/*
	 * @Then("Invalid username error") public void invalid_username_error() {
	 * fromloginjava.getErrMsgInvaludUN(); }
	 * 
	 * @Then("Invalid password error") public void invalid_password_error() {
	 * fromloginjava.getErrMsgInvaliedpass(); }
	 */

	@And("user clicks Sign Out")
	public void user_clicks_sign_out() {
		fromloginjava.Signout();
	}

}
