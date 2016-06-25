package com.springer.link.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.springer.link.utils.WebUtils;

public class SpringerHomePage {
	
	@FindBy( id = "query" )
	private WebElement queryField;
	
	@FindBy( id = "search" )
	private WebElement searchButton;
	
	public SpringerHomePage(WebDriver driver, String url) {
		
		driver.get(url);
		PageFactory.initElements(driver, this);
	}

	public SearchResultsPage search(WebDriver driver, String keyword) {
		
		queryField.clear();
		queryField.sendKeys(keyword);
		WebUtils.waitUntilElementClickable(driver, searchButton);
		searchButton.click();
		
		return PageFactory.initElements(driver, SearchResultsPage.class);
	}
	
	
}
