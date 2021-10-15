package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAddressesPage {
	
	private WebDriver driver;
	
	private By myAddressesLabel = By.xpath("//span[contains(text(),'My addresses')]");
	private By newaddress = By.xpath("//span[contains(text(),'Add a new address')]");
	
	public MyAddressesPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String pageTitle() throws InterruptedException {
		Thread.sleep(3000);
		return driver.getTitle();
	}
	
	public boolean myAddressesLabel() {
		return driver.findElement(myAddressesLabel).isDisplayed();
	}
	
	public void clickOnNewAddress() {
		driver.findElement(newaddress).click();
	}
	

}
