package genericPackage;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class InitiateBrowserClass {

	public static WebDriver invokeBrowser(String browser, String runEvn) throws Exception {
		if (runEvn.equalsIgnoreCase("GRID")) {
			return createRemoteInstance(browser);
		} else if (runEvn.equalsIgnoreCase("LOCAL")) {
			return createLocalInstance(browser);
		} else {
			System.out.println("Invalid parameter in function invokeBrowser()");
			return null;
		}

	}

	public static RemoteWebDriver createLocalInstance(String browser) throws Exception {
		ChromeOptions chromeOptions = new ChromeOptions();
		
		switch (browser) {
		case "chrome":			
            chromeOptions.addArguments("--start-maximized");
            return new ChromeDriver(chromeOptions);
		case "edge":
			System.setProperty("webdriver.edge.driver", "C:\\Tools\\Driver\\msedgedriver.exe");
			return new org.openqa.selenium.edge.EdgeDriver();
		default:
			return null;
		}

	}

	public static RemoteWebDriver createRemoteInstance(String browser) throws Exception {

 		URL gridUrl = new URL("http://localhost:4444/wd/hub");

		switch (browser) {
		case "chrome":
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--start-maximized");
			return new RemoteWebDriver(gridUrl, chromeOptions);
		case "edge":
			EdgeOptions edgeOptions = new EdgeOptions();
			return new RemoteWebDriver(gridUrl, edgeOptions);

		default:
			throw new IllegalArgumentException();
		}

	}

}
