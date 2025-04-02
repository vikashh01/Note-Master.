
@tag
Feature: Registration Book

  @tag1
  Scenario: Registeration Book Valid username and password
    Given The use onn the registration page
    And User firstName
    And User lastName
    And User name 
    And User password
    And User ComformPassword
    And gender
    Then Click on Registration

