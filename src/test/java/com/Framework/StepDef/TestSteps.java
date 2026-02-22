package com.Framework.StepDef;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import UI.Runner.SmokeRun;
import genericPackage.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSteps {
	WebDriver driver;
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() throws Exception {
		
		DriverManager.getDriver().get("https://www.google.com");
		System.out.println( DriverManager.getDriver().getTitle());
        Assert.assertEquals(false, false);


	    
	}
	@When("the user enters valid username and password")
	public void the_user_enters_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Step Executed - the user enters valid username and password");
	    Assert.assertEquals("Test true", "Test true");
	}
	@When("clicks the login button")
	public void clicks_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step Executed - clicks the login button");
	}
	@Then("the user should be redirected to the dashboard")
	public void the_user_should_be_redirected_to_the_dashboard() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("the user should be redirected to the dashboard");
	}
}
