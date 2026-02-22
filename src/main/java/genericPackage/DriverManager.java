package genericPackage;

import org.openqa.selenium.WebDriver;

public class DriverManager {



	    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	    public static void setDriver(WebDriver driverInstance) {
	        driver.set(driverInstance);	 
	        System.out.println("Driver type set to - " + driver.get());
	    }
	    
	    public static WebDriver getDriver() {	    	
	    	return driver.get(); 
	        
	    }
	    
	    public static void unload() {
	        driver.remove();
	    }



}
