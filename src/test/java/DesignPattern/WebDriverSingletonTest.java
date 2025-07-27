package DesignPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebDriverSingletonTest {
    public static void main(String[] args) {
        // Step 1: Get the WebDriver instance from Singleton class
        WebDriver driver = WebDriverSingleton.getDriver();

        // Step 2: Use the WebDriver instance to perform actions
        driver.get("https://www.example.com");

        // Find an element and perform some action
        WebElement element = driver.findElement(By.xpath("//h1"));
        System.out.println("Text from page: " + element.getText());

        // Step 3: Quit the WebDriver session
        WebDriverSingleton.quitDriver();
    }
}
