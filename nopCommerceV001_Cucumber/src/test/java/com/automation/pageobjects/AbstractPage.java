package com.automation.pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;



public class AbstractPage {

	public WebDriver driver;
	
	public AbstractPage (WebDriver driver1)
	{
		this.driver =driver1;
		//driver = Hooks.driver;
	}
	
	public void closeDriver()
	{
		driver.quit();
	}
	
	

}

