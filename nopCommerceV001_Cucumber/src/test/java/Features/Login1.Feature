Feature: Login

@sanity
Scenario: Successful login with Valid Credentials

   Given user Launch Chrome Browser
   When user opens URL"https://admin-demo.nopcommerce.com/login"
   And user enters email as "admin@yourstore.com" and password as "admin"
   And click on Login
   Then page title should be "Dashboard / nopCommerce administration"
   When user clicks on Logout link
   Then page title should be "Your store. Login"
   And close browser
   
   @regression
   Scenario Outline: Successful login with Datadriven

   Given user Launch Chrome Browser
   When user opens URL"https://admin-demo.nopcommerce.com/login"
   And user enters email as "<email>" and password as "<password>"
   And click on Login
   Then page title should be "Dashboard / nopCommerce administration"
   When user clicks on Logout link
   Then page title should be "Your store. Login"
   And close browser
   
   
   Examples:
   |email    |password |
   |admin@yourstore.com|admin|
   |admin1@yourstore.com|admin123|
   