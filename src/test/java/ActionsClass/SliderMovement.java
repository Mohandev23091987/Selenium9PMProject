package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderMovement {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/slider/");
        driver.manage().window().maximize();

        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));


        WebElement slider = driver.findElement(By.cssSelector(".ui-slider-handle"));

        Actions actions = new Actions(driver);


        actions.clickAndHold(slider).moveByOffset(100, 0).release().perform();

        driver.quit();
    }
}
