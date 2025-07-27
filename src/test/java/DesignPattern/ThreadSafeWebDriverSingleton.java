package DesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreadSafeWebDriverSingleton {

    // Step 1: Use ThreadLocal to ensure thread safety
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>() {
        @Override
        protected WebDriver initialValue() {
            // Initialize WebDriver for each thread
            return new ChromeDriver();
        }
    };

    // Step 2: Public method to get the WebDriver instance for the current thread
    public static WebDriver getDriver() {
        return driver.get();
    }

    // Step 3: Method to quit the WebDriver instance
    public static void quitDriver() {
        WebDriver d = driver.get();
        if (d != null) {
            d.quit();
            driver.remove();  // Remove the WebDriver instance for the current thread
        }
    }
}
