package com.Framework.StepDef;


	import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.sql.Driver;

import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import UI.Runner.SmokeRun;
import genericPackage.*;

	public class Hooks {

		@After
	    public void tearDown(Scenario scenario) {

	        WebDriver driver = DriverManager.getDriver();

	        if (scenario.isFailed() && driver != null) {
	            byte[] screenshot = ((TakesScreenshot) driver)
	                    .getScreenshotAs(OutputType.BYTES);
	            scenario.attach(screenshot, "image/png", "Failed Screenshot");
	        }

	        if (driver != null) {
	            driver.quit();
	            DriverManager.unload();
	        }
	    }
		
		@Before
		public void setUp() throws Exception {
			String browser = SmokeRun.browser.get();
	        String runMode = SmokeRun.runMode.get();
			
		    DriverManager.setDriver(InitiateBrowserClass.invokeBrowser(browser, runMode));
		}


	}

