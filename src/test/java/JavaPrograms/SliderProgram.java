package JavaPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderProgram {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            // Open the page with the slider
            driver.get("https://jqueryui.com/slider/"); // Example slider URL
            driver.manage().window().maximize();

            // Switch to the iframe containing the slider (specific to jQuery UI demo)
            driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

            // Locate the slider handle
            WebElement slider = driver.findElement(By.cssSelector(".ui-slider-handle"));

            // Create Actions object
            Actions move = new Actions(driver);

            // Drag the slider by 100 pixels to the right
            move.clickAndHold(slider).moveByOffset(100, 0).release().perform();

            // Pause to see result
            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
