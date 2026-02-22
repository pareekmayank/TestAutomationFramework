Feature: Login functionality
  
@smoke
  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters valid username and password
