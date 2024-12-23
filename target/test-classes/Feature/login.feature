Feature: Bookcart Application Demo

  Background: 
    Given User Click on the Login Link

  @smoke @run
  Scenario: Login Should be Success
    And User Enter the user name "Yogesh"
    And User Enter the Password "Yogesh@123"
    When User click on the login button
    Then Login should be Success

  @smoke
  Scenario: Login Should be Fail
    And User Enter the user name "Sam"
    And User Enter the Password "Sam123"
    When User click on the login button
    But Login should be Fail
