package JavaPrograms;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShadowDOMElements {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open a page with Shadow DOM
        driver.get("https://books-pwakit.appspot.com/");

        // Wait for the page to load
        Thread.sleep(10000);

        // Use JavaScript to access shadow DOM and get the search input element
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Get the shadow root and the search input inside it
//        WebElement searchInput = (WebElement) js.executeScript(
//                "return document.querySelector('book-app')" +
//                        ".shadowRoot.querySelector('app-header app-toolbar book-input-decorator')" +
//                        ".querySelector('input');"
//        );

        WebElement searchInput = (WebElement)  js.executeScript("return document.querySelector(\"body > book-app\").shadowRoot.querySelector(\"#input\")");

        // Enter text in the shadow DOM input field
        searchInput.sendKeys("Selenium WebDriver");

        // Wait to observe
        Thread.sleep(3000);

//        driver.quit();
    }
}
