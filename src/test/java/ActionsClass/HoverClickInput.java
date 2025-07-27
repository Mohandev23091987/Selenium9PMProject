package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverClickInput {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/menu");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        WebElement mainMenu = driver.findElement(By.linkText("Main Item 2"));
        WebElement subItem = driver.findElement(By.linkText("SUB SUB LIST »"));


        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu)
                .moveToElement(subItem)
                .click()
                .build()
                .perform();

        driver.quit();
    }
}
