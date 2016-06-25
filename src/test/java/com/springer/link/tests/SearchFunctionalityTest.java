package com.springer.link.tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.springer.link.pageobjects.SearchResultsPage;
import com.springer.link.pageobjects.SpringerHomePage;


public class SearchFunctionalityTest extends BaseTest {
	
	private String springerLinkSearch_url = "http://link.springer.com";
	
	private SpringerHomePage springerHome;
	private SearchResultsPage searchResult;
	
	@Test
	public void SearchFunctionality(){
		
		// Launch Springer Home Search Link
		springerHome = new SpringerHomePage( driver, springerLinkSearch_url  );
		
		// without entering anything click on Search button
		searchResult = springerHome.search( driver, prop.getProperty("searchKeyWordBlank"));
		Assert.assertEquals(searchResult.getTotlaNoOfBooks( driver ), prop.getProperty("expectedBlankSearchResult"), "Total Number of results not matched!");
		
		// entering one character and click on Search button
		searchResult = springerHome.search( driver, prop.getProperty("searchKeyWordOneChar") );
		Assert.assertEquals(searchResult.getTotlaNoOfBooks( driver ), prop.getProperty("expectedOneCharSearchResult"), "Total Number of not matched!");
		
		// Verify New Search Button
		searchResult = springerHome.search( driver, prop.getProperty("searchKeyWord") );
		
	}

}
