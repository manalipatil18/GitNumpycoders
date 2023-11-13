package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Login;

public class loginPage{
	
	WebDriver chromedriver = null;
	Login fromloginjava;
	
	
//	@Given("browser is open")
//	public void browser_is_open() {
//		
//	    chromedriver = new ChromeDriver();
//		chromedriver.manage().window().maximize();
//		chromedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		
//		chromedriver.get("https://dsportalapp.herokuapp.com/home"); 
//		
//		
//	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		chromedriver = new ChromeDriver();
	    chromedriver.manage().window().maximize();
		chromedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		chromedriver.get("https://dsportalapp.herokuapp.com/home"); 
	
	    fromloginjava = new Login(chromedriver);
	    fromloginjava.Signinstep();
	}

	@When("^user enters(.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
		//username = "";
		fromloginjava.enterusername(username);
		fromloginjava.enterpassword(password);
	}

	@And("user clicks on login")
	public void user_clicks_on_login() {
		//System.out.println("i am in login");
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

	@Then("Invalid username error")
	public void invalid_username_error() {
		fromloginjava.getErrMsgInvaludUN();
	}
	
	@Then("Invalid password error")
	public void invalid_password_error() {
		fromloginjava.getErrMsgInvaliedpass();
	}
	
	@And("user clicks Sign Out")
	public void user_clicks_sign_out() {
		fromloginjava.Signout();
	}

}
