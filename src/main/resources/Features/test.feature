Feature: Login functionality
  As a valid user
  I want to log into the application
  So that I can access my dashboard
@smoke
  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters valid username and password
