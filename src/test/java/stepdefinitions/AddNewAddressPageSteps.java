package stepdefinitions;

import org.junit.Assert;

import com.pages.AddNewAddressPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddNewAddressPageSteps {
	private String title;
	
	AddNewAddressPage newAddress = new AddNewAddressPage(DriverFactory.getDriver());
	
	@Given("user is already on the add new address page")
	public void user_is_already_on_the_add_new_address_page() {
		Assert.assertTrue(newAddress.validateNewAddressPage());
	}

	@When("user gets the title of the new address page")
	public void user_gets_the_title_of_the_new_address_page() {
		title = newAddress.newAddressPageTitle();
	}

	@Then("the title of the page is {string}")
	public void the_title_of_the_page_is(String expectedTitle) {
		Assert.assertEquals(expectedTitle, title);
	}

	@Then("Your Addresses Label is displayed")
	public void your_addresses_label_is_displayed() {
		Assert.assertTrue(newAddress.yourAddressLabel());
	}
	
	@Given("new Address form is displayed")
	public void new_address_form_is_displayed() {
		Assert.assertTrue(newAddress.validateAddressForm());
	}

	@Then("user enters {string} {string} {string}")
	public void user_enters(String firstname, String lastname, String company) {
		newAddress.addCompany(firstname, lastname, company);
	}

	@Then("user enters {string} {string} {string} {string} {string}")
	public void user_enters(String address, String city, String state, String zipcode, String country) {
		newAddress.addAddress(address, city, state, zipcode, country);
	}

	@Then("user enters {string} {string} and {string}")
	public void user_enters_and(String phone, String mobile, String alias) {
		newAddress.contactDetails(phone, mobile, alias);
	}
	
	@Then("user clicks on save button")
	public void user_clicks_on_save_button() {
		newAddress.save();
	}

}
