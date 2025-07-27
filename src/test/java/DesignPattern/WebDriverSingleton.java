package DesignPattern;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebDriverSingleton {
    // Step 1: Create a static variable to hold the WebDriver instance
    private static WebDriver driver;
    // Step 2: Private constructor to prevent instantiation
    private WebDriverSingleton() {
        // Constructor is private to prevent the creation of instances outside the class
    }
    // Step 3: Public static method to return the WebDriver instance (Lazy Initialization)
    public static WebDriver getDriver() {
        if (driver == null) {
            // Step 4: Initialize the WebDriver instance if it doesn't already exist
            driver = new ChromeDriver();  // Or use any other WebDriver, such as FirefoxDriver, EdgeDriver, etc.
        }
        return driver;  // Return the existing WebDriver instance
    }
    // Step 5: Method to quit the WebDriver session (clean up)
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;  // Set driver to null after quitting to allow garbage collection
        }
    }
}
