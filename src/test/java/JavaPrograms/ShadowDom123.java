package JavaPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDom123 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // Maximize and open URL
        driver.manage().window().maximize();

        driver.get("https://letcode.in/shadow"); // Sample form page

        Thread.sleep(2000);
        // Initialize JavaScriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

//       WebElement ele = (WebElement) js.executeScript("return document.querySelector('#open-shadow').shadowRoot.querySelector('#fname')");
//        ele.sendKeys("mohan");

//        driver.findElement(By.xpath("//*[@id='open-shadow']")).getShadowRoot()
//                .findElement(By.cssSelector("#fname")).sendKeys("ravi");


        js.executeScript("document.querySelector('my-web-component').myRoot.querySelector('#lname').value='Selenium'");




    }
}
