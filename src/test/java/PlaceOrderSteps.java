package test.java;

import junit.framework.TestCase;
import main.java.Menu;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PlaceOrderSteps extends TestCase{
	
	Menu menu = new Menu();
	
	@Given("^customer is browsing the menu,$")
	public void customer_is_browsing_the_menu() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    // throw new PendingException();
		
	}

	@When("^customer selects a particular item or group of items,$")
	public void customer_selects_a_particular_item_or_group_of_items() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^I should be able to add that item in my cart$")
	public void I_should_be_able_to_add_that_item_in_my_cart() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Given("^customer has added items in the cart,$")
	public void customer_has_added_items_in_the_cart() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^customer clicks on view cart,$")
	public void customer_clicks_on_view_cart() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^customer should see those items$")
	public void customer_should_see_those_items() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^he should be able to remove items from the cart$")
	public void he_should_be_able_to_remove_items_from_the_cart() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}



}
