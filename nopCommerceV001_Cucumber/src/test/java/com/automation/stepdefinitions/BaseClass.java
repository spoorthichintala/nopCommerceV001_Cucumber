package com.automation.stepdefinitions;

import java.util.Properties;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import pageObjects.LoginPage;

public class BaseClass {
	
	public WebDriver driver;
	public LoginPage lp;
	public static Logger logger;
	public Properties configProp; 
	
	//created for generating random string 	for unique email
	public static String randomstring(){
		String genereratedstring1=RandomStringUtils.randomAlphabetic(5);
		return genereratedstring1;
	}
	
	public String getPageTitle(){
		return driver.getTitle();
	}
	
	
	}


