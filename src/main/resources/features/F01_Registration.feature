@smoke
Feature: F01_Registration | Users create new account
  #Happy Scenario
  Scenario: Successful Registration (Valid data)
    Given User navigate to registration page
    When User chooses a gender
    And User Enters "Automation" & "Tester"
    And User Chooses date of birth
    And User Enters Email
    And User Enters Company Name
    And User Enters "utrials123" Password
    And User Confirms "utrials123" Password
    And User Click register button
    Then New Account is registered