package com.springer.link.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SearchResultsPage {
	
	@FindBy( xpath = "//div[@id='kb-nav--main']/div[1]/h1/strong")
	private WebElement totalResult;
	
	@FindBy( id = "global-search-new" )
	private WebElement newSearchButton;

	public String getTotlaNoOfBooks(WebDriver driver) {
		
		return totalResult.getText();
	}
	
	

}
