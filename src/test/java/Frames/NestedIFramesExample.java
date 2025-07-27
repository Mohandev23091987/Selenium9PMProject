package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIFramesExample {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.automationtesting.in/Frames.html");

        // Click the tab for nested iFrames
        driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();

        // Switch to outer iframe
        WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
        driver.switchTo().frame(outerFrame);

        // Switch to inner iframe
        WebElement innerFrame = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(innerFrame);

        // Enter text
        WebElement inputField = driver.findElement(By.xpath("//input[@type='text']"));
        inputField.sendKeys("Inside nested iframe");

        driver.switchTo().parentFrame();
        //then perform your operation on outerframe

        // Switch back to main page
        driver.switchTo().defaultContent();

        // Close browser
        driver.quit();
    }
}

