package stepdefinitions;

import org.junit.Assert;

import com.pages.WomenTShirtsPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WomenTShirtsPageSteps {
	
	private WomenTShirtsPage womenTShirtsPage = new WomenTShirtsPage(DriverFactory.getDriver());
	
	@Given("user is on T-shirts page {string}")
	public void user_is_on_t_shirts_page(String expectedTitle) {
		womenTShirtsPage.goToWomenTshirtPage();
		String title = womenTShirtsPage.getTshirtPageTitle();
		Assert.assertEquals(expectedTitle, title);
		
	}

	@When("Catalog is displayed")
	public void catalog_is_displayed() {
	boolean flag = womenTShirtsPage.catalogIsDisplayed();
	Assert.assertTrue("catalog is not displayed", flag);
	}

	@Then("user applies filter")
	public void user_applies_filter() {
		womenTShirtsPage.selectCatalogFilters();
	}

}
