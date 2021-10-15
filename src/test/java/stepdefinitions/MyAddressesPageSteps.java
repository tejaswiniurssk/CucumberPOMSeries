package stepdefinitions;

import org.junit.Assert;

import com.pages.MyAddressesPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MyAddressesPageSteps {
	
	private String title;
	
	private MyAddressesPage myAddressesPage = new MyAddressesPage(DriverFactory.getDriver());
	
	@Given("user is on My Addresses page")
	public void user_is_on_My_Addresses_page() throws InterruptedException{
		title = myAddressesPage.pageTitle();
		System.out.println("My Addresses Page title is: "+ title);
	}
	
	@Then("my addresses label is displayed")
	public void my_addresses_label_is_displayed() {
		Assert.assertTrue(myAddressesPage.myAddressesLabel());
	}

	@Then("addresses page title should be {string}")
	public void addresses_page_title_should_be(String expectedTitleName) {
		Assert.assertTrue(title.contains(expectedTitleName));
	}
	

	@Then("user clicks on Add a new address")
	public void user_clicks_on_add_a_new_address() {
		myAddressesPage.clickOnNewAddress();
		
	
	}
}
