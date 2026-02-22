package UI.Runner;


import io.cucumber.testng.CucumberOptions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import genericPackage.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "src\\main\\resources\\Features", glue = {"com.Framework.StepDef"}, tags = "@smoke", plugin = {
        "pretty",
        "json:target/cucumber.json",
        "html:target/cucumber-html-report",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
},
 dryRun = false)
public class SmokeRun extends AbstractTestNGCucumberTests{
    public static ThreadLocal<String> browser = new ThreadLocal<>();
    public static ThreadLocal<String> runMode = new ThreadLocal<>();

    @BeforeTest
    @Parameters({"browser", "runMode"})
    public void setup(String browser, String runMode) {
        SmokeRun.browser.set(browser);
        SmokeRun.runMode.set(runMode);
    }
    
    
   
    

}
