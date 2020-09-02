//package com.genesis.stepdefinitions;
//import com.genesis.utils.*;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//public class AbstractPageStepDefinition {
//
//	protected static WebDriver driver=BrowserFactory.startBrowser("firefox", "https://10.201.7.204/genesis-ui");
//	
////	protected WebDriver getDriver()
////	{
////	
////		if(driver == null){
////			driver=new FirefoxDriver();
////		}
////			return driver;
////    }
//	
//}





//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//public class AbstractPageStepDefinition {
//
////	protected static WebDriver driver;
//	public static WebDriver driver= BrowserFactory.startBrowser("firefox", "http://10.201.8.14:8080/genesis-ui");
//	protected WebDriver getDriver()
//	{
//	
//		if(driver == null){
//			driver=new FirefoxDriver();
//		}
//			return driver;
//    }
//	
//}

package com.genesis.stepdefinitions;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.Before;

public class Hooks {

	//public WebDriver driver=new FirefoxDriver();
	
	
			//http://10.201.8.14:8080/genesis-ui");
	
	public static WebDriver driver;
	//= BrowserFactory.startBrowser("firefox", "http://10.201.8.14:8080/genesis-ui");
	
     @Before
     public void openBrowser() throws MalformedURLException {
    	 System.out.println("Called openBrowser");
    	 
    	 //BrowserFactory.startBrowser("firefox", "http://10.201.8.14:8080/genesis-ui");
    	 
    	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Automation Scripts\\Automation Scripts\\Selenium_jars\\chromedriver.exe");
    	// System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
			
    	driver = new ChromeDriver();
    	// driver = new FirefoxDriver();
			
			//driver.get("http://192.168.0.157:4200/#/genesis/");
			driver.get("http://automationpractice.com/index.php");
    	//driver.get("http://183.82.50.134/bank-poc/1/");
   // driver.get("http://192.168.0.14/bank-poc/1/index.html");
    	//driver.get("http://192.168.5.135:9080/his-app-0.0.1");
    	//driver.get("http://192.168.5.135:9080/his-app-0.0.1/common/dashboard/open.action");
    	//driver.get("https://encodable.com/uploaddemo/");
	 	// driver.manage().deleteAllCookies();
    	 }
	
}
	


