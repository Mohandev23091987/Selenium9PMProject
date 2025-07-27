package JavaPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JavaScriptExecutor {


        // Set the path to chromedriver if not in PATH

        // Initialize WebDriver
        public static void main(String[] args) throws InterruptedException {
            // Setup Chrome driver
            WebDriver driver = new ChromeDriver();

            // Maximize and open URL
            driver.manage().window().maximize();
            driver.get("https://www.w3schools.com/html/html_forms.asp"); // Sample form page

            // Initialize JavaScriptExecutor
            JavascriptExecutor js = (JavascriptExecutor) driver;

            // 1. Highlight input field
            WebElement inputField = driver.findElement(By.id("fname"));
            js.executeScript("arguments[0].style.border='3px solid red'", inputField);
            Thread.sleep(1000);
//
            // 2. Enter text using JavaScript
            js.executeScript("arguments[0].value='John Doe'", inputField);
//
            // 3. Scroll down the page
            js.executeScript("window.scrollBy(0,500)");
            Thread.sleep(1000);
//
//
//
            // 5. Get page title using JavaScript
            String title = (String) js.executeScript("return document.title;");
            System.out.println("Page title is: " + title);
//
            // 6. Alert popup using JavaScript
            js.executeScript("alert('This is an alert from JavaScriptExecutor!');");
            Thread.sleep(2000);
            driver.switchTo().alert().accept();
//
            // 4. Click the "Submit" button using JavaScript
            WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
            js.executeScript("arguments[0].click();", submitButton);
//
            // 7. Refresh the page using JavaScript
            js.executeScript("history.go(0);");
//
//
//
            // Close browser
            Thread.sleep(2000);
            driver.quit();
        }

    }

