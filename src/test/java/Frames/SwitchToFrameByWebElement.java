package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrameByWebElement {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to test site
        driver.get("https://demo.automationtesting.in/Frames.html");

        // Switch to single iframe
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='SingleFrame']")));

        // Find input field and type text
        WebElement inputBox = driver.findElement(By.xpath("//input[@type='text']"));
        inputBox.sendKeys("Hello, iFrame!");

        // Switch back to main content
        driver.switchTo().defaultContent();

        // Close browser
        driver.quit();
    }
}
