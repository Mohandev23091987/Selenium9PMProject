package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CountIFrames {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.automationtesting.in/Frames.html");

        List<WebElement> allIFrames = driver.findElements(By.tagName("iframe"));
        System.out.println("Total number of iFrames on the page: " + allIFrames.size());

        driver.quit();
    }
}

