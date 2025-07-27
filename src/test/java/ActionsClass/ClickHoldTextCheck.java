package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickHoldTextCheck {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();

        WebElement clickHold = driver.findElement(By.id("rightClickBtn"));

        Actions actions = new Actions(driver);
        actions.clickAndHold(clickHold).pause(java.time.Duration.ofSeconds(2)).release().perform();

        WebElement message = driver.findElement(By.id("rightClickMessage"));
        System.out.println("Message shown: " + message.getText());

        driver.quit();
    }
}
