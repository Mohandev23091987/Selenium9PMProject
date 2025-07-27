package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizableElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/resizable/");
        driver.manage().window().maximize();
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

        WebElement resizeHandle = driver.findElement(By.cssSelector(".ui-resizable-se"));

        Thread.sleep(5000);

        Actions actions = new Actions(driver);
        actions.clickAndHold(resizeHandle)
                .moveByOffset(50, 25)
                .release()
                .perform();

        Thread.sleep(5000);

        driver.quit();
    }
}
