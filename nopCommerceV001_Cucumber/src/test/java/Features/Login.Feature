Feature: OrangeHRM Login

  Scenario: Logo present on OrangeHRM home page
  Given  launch chrome browser
  When  open OrangeHRM homepage
  Then  verify that the logo present on page
  And I Close the browser