package JavaPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDoM2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open a page with Shadow DOM
        driver.get("https://letcode.in/shadow");

        // Wait for the page to load
        Thread.sleep(1000);

        // Use JavaScript to access shadow DOM and get the search input element
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //WebElement ele = (WebElement)js.executeScript("return document.querySelector('#open-shadow')
        // .shadowRoot.querySelector('#fname')");
        //ele.sendKeys("Mohan");

        //js.executeScript("document.querySelector('my-web-component').myRoot.querySelector('#lname').value='ravi'");


        driver.findElement(By.xpath("//*[@id='open-shadow']")).getShadowRoot()
                .findElement(By.cssSelector("#fname")).sendKeys("Mohan");


    }
}
