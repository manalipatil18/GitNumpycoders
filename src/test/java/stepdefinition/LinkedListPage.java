package stepdefinition;

import Utilities.Helper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Linkedlistcode;

public class LinkedListPage extends Bclass{


@Given("User is logged in and is on Home Page")
public void user_is_logged_in_and_is_on_home_page() {
	fromLLjava = new Linkedlistcode(Helper.getDriver());
	Helper.openPage();
	Helper.ValidLogin();
}

@When("User clicks on Link list option from the dropdown menu")

public void user_clicks_on_link_list_option_from_the_dropdown_menu() {
	fromLLjava.selectLL();
}

@Then("User is on Linked list page")
public void user_is_on_linked_list_page() {
	fromLLjava = new Linkedlistcode(Helper.getDriver());
    fromLLjava.OnLLPage();
}

@When("User clicks on Introduction")
public void user_clicks_on_introduction() {
	
	fromLLjava.IntroBttn();
}

@Then("User lands on Introduction page")
public void user_lands_on_introduction_page() {
	fromLLjava.OnIntroPage();
}

@Given("User gets back on Intro page")
public void user_gets_back_on_Intro_page() {
	fromLLjava = new Linkedlistcode(Helper.getDriver());
	Helper.NavBack();
	fromLLjava.OnIntroPage();
}
@When("User clicks on Creating Linked List")
public void user_clicks_on_creating_linked_list() {
	fromLLjava.CreatelinklistBtn();
}

@Then("User lands on Creating Linked List page")
public void user_lands_on_creating_linked_list_page() {
	fromLLjava.OnCreateLLPage();
}

@Given("User gets back on Intro page from Creating Link list page")
public void user_gets_back_on_intro_page_from_creating_link_list_page() {
	fromLLjava = new Linkedlistcode(Helper.getDriver());
	Helper.NavBack();
	fromLLjava.OnCreateLLPage();
}
@When("User clicks on Types of Linked List")
public void user_clicks_on_types_of_linked_list() {
	fromLLjava.TypeofLLBtn();
}

@Then("User lands on Types of Linked List page")
public void user_lands_on_types_of_linked_list_page() {
	fromLLjava.OnTypeofLLPage();
}

@Given("User gets back on Intro page from Types of Linked List page")
public void user_gets_back_on_intro_page_from_types_of_linked_list_page() {
	fromLLjava = new Linkedlistcode(Helper.getDriver());
	Helper.NavBack();
	fromLLjava.OnTypeofLLPage();
}

@When("User clicks on Implement Linked List")
public void user_clicks_on_implement_linked_list() {
	fromLLjava.ImplementLLBtn();
}

@Then("User lands on Implement Linked List page")
public void user_lands_on_implement_linked_list_page() {
	fromLLjava.OnImplementLLPage();
}

@Given("User gets back on Intro page from Implement Linked List page")
public void user_gets_back_on_intro_page_from_implement_linked_list_page() {
	fromLLjava = new Linkedlistcode(Helper.getDriver());
	Helper.NavBack();
	fromLLjava.OnImplementLLPage();
}

@When("User clicks on Traversal")
public void user_clicks_on_traversal() {
    fromLLjava.TraversalLLBtn();
}

@Then("User lands on Traversal page")
public void user_lands_on_traversal_page() {
    fromLLjava.OnTraversalLLPage();
}

@Given("User gets back on Intro page from Traversal page")
public void user_gets_back_on_intro_page_from_traversal_page() {
	fromLLjava = new Linkedlistcode(Helper.getDriver());
	Helper.NavBack();
	 fromLLjava.OnTraversalLLPage();
}

@When("User clicks on Insertion")
public void user_clicks_on_insertion() {
	fromLLjava.InsertionLLBtn();
}

@Then("User lands on Insertion page")
public void user_lands_on_insertion_page() {
	fromLLjava.OnInsertionLLPage();
}

@Given("User gets back on Intro page from Insertion page")
public void user_gets_back_on_intro_page_from_insertion_page() {
	fromLLjava = new Linkedlistcode(Helper.getDriver());
	Helper.NavBack();
	fromLLjava.OnInsertionLLPage();
}

@When("User clicks on Deletion")
public void user_clicks_on_deletion() {
	fromLLjava.DeletionLLBtn();
}

@Then("User lands on Deletion page")
public void user_lands_on_deletion_page() {
	fromLLjava.OnDeletionLLPage();
}

@Given("User gets back on Intro page from Deletion page")
public void user_gets_back_on_intro_page_from_deletion_page() {
	fromLLjava = new Linkedlistcode(Helper.getDriver());
	Helper.NavBack();
	fromLLjava.OnDeletionLLPage();
}

@When("User clicks Practice Questions button of Linked list")
public void user_clicks_practice_questions_button_of_linked_list() {
	fromLLjava.PQLLBtn();
}

@And("user gets into Practice Questions of Linked list")
public void user_gets_into_practice_questions_of_linked_list() {
	fromLLjava.OnPQLLpage();
}

//@Then("user navigates back and signs out")
//public void user_navigates_back_and_signs_out() {
//	fromLLjava.SignoutBtn();
//}

}
