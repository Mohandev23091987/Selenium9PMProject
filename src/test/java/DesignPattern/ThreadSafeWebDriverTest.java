package DesignPattern;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ThreadSafeWebDriverTest {

    @BeforeTest
    public void setUp() {
        // This will initialize the WebDriver for the current thread
        WebDriver driver = ThreadSafeWebDriverSingleton.getDriver();
    }

    @Test
    public void testLoginPageTitle() {
        WebDriver driver = ThreadSafeWebDriverSingleton.getDriver();
        driver.get("https://example.com/login");
        String title = driver.getTitle();
        System.out.println(Thread.currentThread().getName() + " - Page Title: " + title);
        //Assert.assertEquals("Home - Example", title);  // Replace with your expected title
    }

    @Test
    public void testHomePageTitle() {
        WebDriver driver = ThreadSafeWebDriverSingleton.getDriver();
        driver.get("https://example.com");
        String title = driver.getTitle();
        System.out.println(Thread.currentThread().getName() + " - Home Page Title: " + title);
        //Assert.assertEquals("Home - Example", title);  // Replace with your expected title
    }

    @AfterTest
    public void tearDown() {
        // Quit the driver after each test
        ThreadSafeWebDriverSingleton.quitDriver();
    }
}
