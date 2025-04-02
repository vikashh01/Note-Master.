
Feature: OrangeHRM Login 
  
  
  Scenario: Valid login with correct username and password
    Given  user on the login page
    And  the user enter Username
    And  the user enter password
    Then the user should be redirected to the dashboard

