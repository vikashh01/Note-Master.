
@tag
Feature: Book Login
  

  @tag1
  Scenario: Valid login with correct username and password
    Given user on the login page
    And user enter the username
    And user enter the password
    Then user click on login

 @tag2
  Scenario: Inalid login with correct username and password
    Given user on the login page
    And user enter the username
    And user enter the password
    Then user click on login



