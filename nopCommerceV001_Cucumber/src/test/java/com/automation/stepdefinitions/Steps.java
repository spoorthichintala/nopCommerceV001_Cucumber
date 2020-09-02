package com.automation.stepdefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjects.LoginPage;

public class Steps extends BaseClass {
	
	/*public WebDriver driver;
	public LoginPage lp;*/
	
	
	
/*	@Before
	public void setUp() throws IOException{
		configProp = new Properties();
        FileInputStream cofigPropfile = new FileInputStream("config.properties");
        configProp.load(cofigPropfile);
        logger =Logger.getLogger("nopCommerce");
		 PropertyConfigurator.configure("Log4j.properties");
        
        String br = configProp.getProperty("browser");
        if(br.equals("chrome")){
        	System.setProperty("webdriver.chrome.driver",configProp.getProperty("chromepath"));
   		 //System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Automation Scripts\\Automation Scripts\\Selenium_jars\\chromedriver.exe");
 		// System.setProperty("webdriver.chrome.driver",System.getProperty("user")+"//Drivers//chromedriver.exe");

   		 driver = new ChromeDriver();
        }
        else if(br.equals("firefox")){
        	System.setProperty("webdriver.gecko.driver",configProp.getProperty("firefoxpath"));
        	driver = new FirefoxDriver();

        }
        else if(br.equals("msgedge")){
        	System.setProperty("webdriver.gecko.driver",configProp.getProperty("ieedgepath"));
        	driver = new EdgeDriver();

        }
        
}*/
	
	@Given("^user Launch Chrome Browser$")
    public void user_launch_chrome_browser() throws Throwable {
		logger =Logger.getLogger("nopCommerce");
		 PropertyConfigurator.configure("Log4j.properties");
   		 System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Automation Scripts\\Automation Scripts\\Selenium_jars\\chromedriver.exe");
   		 driver = new ChromeDriver();

		 
       logger.info("**Launching browser**");
       lp=new LoginPage(driver);
       
    }

    @When("^user opens URL\"([^\"]*)\"$")
    public void user_opens_urlsomething(String url) throws Throwable {
        driver.get(url);
        logger.info("**Entered URL******");
    }
    
    @And("^user enters email as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void user_enters_email_as_something_and_password_as_something(String email, String password) throws Throwable {
        lp = PageFactory.initElements(driver, LoginPage.class);

    	/*lp.txtemail.clear();
    	lp.txtemail.sendKeys(email);
    	lp.txtpswd.clear();
    	lp.txtpswd.sendKeys(password);*/
    	
    	/*driver.findElement(By.id("Email")).clear();
    	driver.findElement(By.id("Email")).sendKeys(email);
    	driver.findElement(By.id("Password")).clear();
    	driver.findElement(By.id("Password")).sendKeys(password);*/
    	
    	Thread.sleep(5000);
       lp.setUsername(email);
       lp.setPassword(password);
       logger.info("*******entered email and password*****");
}

    @And("^click on Login$")
    public void click_on_login() throws Throwable {
    	lp=PageFactory.initElements(driver,LoginPage.class);
    	lp.loginbutton();
    	//lp.loginbutton();
    	//driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
    	logger.info("*********Logged into application********");
    	

    }

    

    @Then("^page title should be \"([^\"]*)\"$")
    public void page_title_should_be_something(String title) throws Throwable {
     if(driver.getPageSource().contains("Login was unsuccessful.")){
    	 driver.close();
    	 Assert.assertTrue(false);
    }
    	 else{
    	Assert.assertEquals(title, driver.getTitle());	 	
    	 }
     logger.info("page Title :" + driver.getTitle() );
     }
    
    
    @When("^user clicks on Logout link$")
    public void user_clicks_on_logout_link() throws Throwable {
    	lp=PageFactory.initElements(driver,LoginPage.class);
    	lp.logoutbtn();
    	//driver.findElement(By.linkText("Logout")).click();
    	Thread.sleep(3000);    
    	logger.info("*****user logged out*****");
    	
    }
    
    @And("^close browser$")
    public void close_browser() throws Throwable {
        driver.quit();
        logger.info("****close the browser*****");
    }


}
