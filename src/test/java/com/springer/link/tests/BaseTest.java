package com.springer.link.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	protected WebDriver driver;
	protected Properties prop;;
	
	@BeforeTest
	public void readPropertyFile(){
		
		FileInputStream fis;
		
		
		try {
			fis = new FileInputStream("./properties/search.properties");
			prop = new Properties();
			prop.load(fis);
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			  
			  e.printStackTrace();
			  
		}
		
		
	}
	
	@BeforeMethod
	public void setUp(){
		
		driver = new FirefoxDriver();
		
	}
	
	@AfterMethod
	public void terarDown(){
		
		driver.quit();
	}
	
	

}
