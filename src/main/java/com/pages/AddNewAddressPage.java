package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AddNewAddressPage {
	
	private WebDriver driver;
	// locators
	private By addressFormHeading = By.xpath("//div//p[contains(text(),'To add a new address, please fill out the form below.')]");
	private By youraddresses = By.xpath("//span[contains(text(),'Your addresses')]");
	private By addressForm = By.xpath("//form[@id='add_address']");
	private By firstname = By.id("firstname");
	private By lastname = By.id("lastname");
	private By company = By.id("company");
	private By address = By.id("address1");
	private By city = By.id("city");
	private By state = By.id("id_state");
	private By zipcode = By.id("postcode");
	private By country = By.id("id_country");
	private By phone = By.id("phone");
	private By mobile = By.id("phone_mobile");
	private By alias = By.id("alias");
	private By saveBtn = By.xpath("//span[contains(text(),'Save')]");
	
	
	//Constructor
	public AddNewAddressPage(WebDriver driver) {
		this.driver = driver;
	}

	//Actions
	
	//Scenario
	public boolean validateNewAddressPage() {
		return driver.findElement(addressFormHeading).isDisplayed();
	}
	
	public String newAddressPageTitle() {
		return driver.getTitle();
	}
	
	public boolean yourAddressLabel() {
		return driver.findElement(youraddresses).isDisplayed();
	}
	
	//Scenario Outline
	
	public boolean validateAddressForm() {
		return driver.findElement(addressForm).isDisplayed();
	}
	
	public void addCompany(String firstname, String lastname, String company) {
		driver.findElement(this.firstname).clear();
		driver.findElement(this.firstname).sendKeys(firstname);
		driver.findElement(this.lastname).clear();
		driver.findElement(this.lastname).sendKeys(lastname);
		driver.findElement(this.company).sendKeys(company);
	}
	
	public void addAddress(String address, String city, String state, String zipcode, String country) {
		Select selectcountry = new Select(driver.findElement(this.country));
		Select selectstate = new Select(driver.findElement(this.state));
		
		driver.findElement(this.address).sendKeys(address);
		driver.findElement(this.city).sendKeys(city);
		selectstate.selectByVisibleText(state);
		driver.findElement(this.zipcode).sendKeys(zipcode);
		selectcountry.selectByVisibleText(country);
		
	}
	
	public void contactDetails(String phone, String mobile, String alias) {
		driver.findElement(this.phone).sendKeys(phone);
		driver.findElement(this.mobile).sendKeys(mobile);
		driver.findElement(this.alias).clear();
		driver.findElement(this.alias).sendKeys(alias);
	}
	
	public void save() {
		driver.findElement(saveBtn).click();
	}
	
	
	
	
	

}
