package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverandClickSubmenu {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        WebElement desktops = driver.findElement(By.linkText("Desktops"));
        WebElement mac = driver.findElement(By.linkText("Mac (1)"));

        Actions actions = new Actions(driver);
        actions.moveToElement(desktops).moveToElement(mac).click().build().perform();

        driver.quit();
    }
}
