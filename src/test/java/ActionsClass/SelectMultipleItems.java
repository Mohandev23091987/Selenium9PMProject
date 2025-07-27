package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class SelectMultipleItems {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.seleniumeasy.com/jquery-dual-list-box-demo.html");
        driver.manage().window().maximize();

        List<WebElement> items = driver.findElements(By.cssSelector(".pickData option"));

        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL)
                .click(items.get(0))
                .click(items.get(2))
                .click(items.get(4))
                .keyUp(Keys.CONTROL)
                .build()
                .perform();

        driver.quit();
    }
}
