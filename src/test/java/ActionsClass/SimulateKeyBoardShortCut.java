package ActionsClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SimulateKeyBoardShortCut {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");

        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys("s").keyUp(Keys.CONTROL).perform();

        driver.quit();
    }
}
