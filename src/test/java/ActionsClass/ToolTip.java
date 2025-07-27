package ActionsClass;

import JavaPrograms.JavaScriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/tooltip/");
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));



        WebElement ageInput = driver.findElement(By.id("age"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",ageInput);
        new Actions(driver).moveToElement(ageInput).perform();

        String tooltip = ageInput.getDomAttribute("title");
        System.out.println("Tooltip text: " + tooltip);

        driver.quit();
    }
}
