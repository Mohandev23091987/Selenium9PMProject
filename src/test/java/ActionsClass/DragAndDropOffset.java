package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropOffset {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/draggable/");
        driver.manage().window().maximize();
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

        Thread.sleep(5000);
        WebElement draggable = driver.findElement(By.id("draggable"));


        Actions actions = new Actions(driver);
        actions.dragAndDropBy(draggable, 150, 100).perform();
         Thread.sleep(5000);
        driver.quit();
    }
}
