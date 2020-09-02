	package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.automation.pageobjects.AbstractPage;

public class LoginPage extends AbstractPage {
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	
	
	@FindBy(how=How.ID,using="Email")
	public
	WebElement txtemail;
	
	
	@FindBy(how=How.ID,using="Password")
	public
	WebElement txtpswd;
	
	@FindBy(how=How.XPATH,using="//input[@class='button-1 login-button']")
	public
	WebElement login;
	
	@FindBy(how=How.LINK_TEXT,using="Logout")
	public
	WebElement logout;
	
	
	public void setUsername(String uname){
		txtemail.clear();
		txtemail.sendKeys(uname);
	}
	
    public void setPassword(String pwd){
    	txtpswd.clear();
    	txtpswd.sendKeys(pwd);
    }
    
    public void loginbutton( ){
    	login.click();
    }
    
    public void logoutbtn(){
    	logout.click();
    }
}
