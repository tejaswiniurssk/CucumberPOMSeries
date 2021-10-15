package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsPage {
	private WebDriver driver;

	private By accountSections = By.cssSelector("div#center_column span");
	private By accountsLabel = By.xpath("//span[contains(text(),'My account')]");
	private By myAddresses = By.xpath("//span[contains(text(),'My addresses')]");
	

	public AccountsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getAccountsPageTitle() {
		return driver.getTitle();
	}

	public int getAccountsSectionCount() {
		return driver.findElements(accountSections).size();
	}

	public List<String> getAccountsSectionsList() {
		List<String> accountsList = new ArrayList<>();
		List<WebElement> accountsHeaderList = driver.findElements(accountSections);

		for (WebElement e : accountsHeaderList) {
			String text = e.getText();
			System.out.println(text);
			accountsList.add(text);
		}

		return accountsList;

	}
	
	public boolean accountsLabel() {
		return driver.findElement(accountsLabel).isDisplayed();
	}
	
//	public void clickOnMyAddresses() {
//		driver.findElement(myAddresses).click();
//		
//	}
	
	public MyAddressesPage clickOnMyAddresses() {
		driver.findElement(myAddresses).click();
		
		return new MyAddressesPage(driver);
		
	}

}
