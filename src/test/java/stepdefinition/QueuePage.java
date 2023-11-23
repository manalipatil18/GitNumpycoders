package stepdefinition;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import Utilities.Helper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Queue;

public class QueuePage extends Bclass{

	@Given("User is logged in and on Home page")
	public void user_is_logged_in_and_on_home_page() {
		fromQjava = new Queue(Helper.getDriver());
		Helper.openPage();
		Helper.ValidLogin();
	}

	@When("User clicks on Get Started button of Queue")
	public void user_clicks_on_get_started_button_of_queue() {
		fromQjava.getstartedbttn();
	}

	@Then("User is on Queue page")
	public void user_is_on_queue_page() {
		fromQjava.OnQueuemainpage();
	}

	@And("User clicks Implementation of queue in Python")
	public void user_clicks_implementation_of_queue_in_python() {
		fromQjava.ImpleBttn();
	}

	@Then("user gets into Implementation of queue in Python page")
	public void user_gets_into_implementation_of_queue_in_python_page() {
		fromQjava.OnImplepage();
	}

	@Given("user is on Implementation of queue in Python page")
	public void user_is_on_implementation_of_queue_in_python_page() {
		fromQjava = new Queue(Helper.getDriver());
		fromQjava.OnImplepage();
	}

	@When("The user enters sheet {string} and {int}")
	public void the_user_enters_sheet_and(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException {
		fromQjava = new Queue(Helper.getDriver());
		fromQjava.Readpythoncode(Sheetname, RowNumber);
	}

	@Given("User gets back on Implementation of queue in python page")
	public void user_gets_back_on_implementation_of_queue_in_python_page() {
		fromQjava = new Queue(Helper.getDriver());
		Helper.NavBack();
		fromQjava.OnImplepage();
	}

	@When("User clicks on Implementation using collections.deque")
	public void user_clicks_on_implementation_using_collections_deque() {
		fromQjava.ImpleUsingcollectionsBttn();
	}

	@Then("User lands on Implementation using collections.deque page")
	public void user_lands_on_implementation_using_collections_deque_page() {
		fromQjava.OnImpleUsingCollpage();
	}

	@Given("User gets back Implementation using collections.deque page")
	public void user_gets_back_implementation_using_collections_deque_page() {
		fromQjava = new Queue(Helper.getDriver());
		Helper.NavBack();
		fromQjava.OnImpleUsingCollpage();
	}

	@When("User clicks on Implementation using array")
	public void user_clicks_on_implementation_using_array() {
		fromQjava.ImpleUsingArrBttn();
	}

	@Then("User lands on Implementation using array page")
	public void user_lands_on_implementation_using_array_page() {
		fromQjava.OnImpleUsingArrpage();
	}

	@Given("User gets back Implementation using array page")
	public void user_gets_back_implementation_using_array_page() {
		fromQjava = new Queue(Helper.getDriver());
		Helper.NavBack();
		fromQjava.OnImpleUsingArrpage();
	}

	@When("User clicks on Queue Operations")
	public void user_clicks_on_queue_operations() {
		fromQjava.QueueOpBttn();
	}

	@Then("User lands on Queue Operations page")
	public void user_lands_on_queue_operations_page() {
		fromQjava.OnQueueOppage();
	}

	@Given("User gets back on Queue Operations from Deletion page")
	public void user_gets_back_on_queue_operations_from_deletion_page() {
		fromQjava = new Queue(Helper.getDriver());
		Helper.NavBack();
		fromQjava.OnQueueOppage();
	}

	@When("User clicks Practice Questions button of Queues")
	public void user_clicks_practice_questions_button_of_queues() {
		fromQjava.PracticeQBtn();
	}

	@When("user gets into Practice Questions of Queues")
	public void user_gets_into_practice_questions_of_queues() {
		fromQjava.OnPRQpage();
	}



}
