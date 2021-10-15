package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WomenTShirtsPage {
	
	private WebDriver driver;
	
	private By womenTab = By.xpath("//a[@title='Women']");
	private By tshirts = By.xpath("//a[contains(text(),'T-shirts')]");
	private By catalogLabel = By.xpath("//p[contains(text(),'Catalog')]");
	private By size = By.id("layered_id_attribute_group_2");
	private By style = By.id("layered_id_feature_11");
	private By condition = By.id("layered_condition_new");
	private By productSort = By.id("selectProductSort");
	
	public WomenTShirtsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void goToWomenTshirtPage() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(womenTab)).build().perform();
		
		driver.findElement(tshirts).click();
	}
	
	public String getTshirtPageTitle() {
		return driver.getTitle();
	}
	
	public boolean catalogIsDisplayed() {
		return driver.findElement(catalogLabel).isDisplayed();
	}
	
	public void selectCatalogFilters() {
		
		driver.findElement(size).click();
		driver.findElement(style).click();
		driver.findElement(condition).click();
		
		Select select = new Select(driver.findElement(productSort));
		
		select.selectByVisibleText("In stock");
		
		
	}
	
	

	
	
	
}
