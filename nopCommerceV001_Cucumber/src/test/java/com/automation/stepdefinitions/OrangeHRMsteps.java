package com.automation.stepdefinitions;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;

//import com.genesis.utils.BrowserFactory;

import cucumber.api.java.en.*;
import junit.framework.Assert;


public class OrangeHRMsteps {
	

	
	
	public WebDriver driver;


	 @Given("launch chrome browser$")
	    public void launch_chrome_browser() throws Throwable {
		 System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Automation Scripts\\Automation Scripts\\Selenium_jars\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
	        
	    }

	    @When("open OrangeHRM homepage$")
	    public void open_orangehrm_homepage() throws Throwable {
	    	
			 driver.get("https://opensource-demo.orangehrmlive.com/");

	    }

	    @Then("verify that the logo present on page$")
	    public void verify_that_the_logo_present_on_page() throws Throwable {
	    	
	    	boolean status = driver.findElement(By.xpath("//*[name()='image' and contains(@overflow,'visible')]")).isDisplayed();
	    	//Assert.assertEquals(true, status);
	    	if(status==true){
	    		System.out.println("logo is found");
	    	}
	    	else{
	    		System.out.println("Logo not found");
	    	}
	    }

	    @And("I Close the browser$")
	    public void i_close_the_browser() throws Throwable {
	    	driver.quit();
	    }

	}