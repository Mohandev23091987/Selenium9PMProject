package scriptClasses.Webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableWithPaginationProgram {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/web-table-element.php");
        boolean recordFound = false;
        while (true) {
            List<WebElement> rows = driver.findElements(By.xpath("//table[@id='example']//tbody/tr"));
            for (WebElement row : rows) {
                if (row.getText().contains("Infosys")) {
                    System.out.println("Found Record: " + row.getText());
                    recordFound = true;
                    break;
                }
            }
            if (recordFound) break;

            WebElement nextBtn = driver.findElement(By.id("example_next"));
            if (nextBtn.getAttribute("class").contains("disabled")) {
                break;
            }
            nextBtn.click();
            Thread.sleep(1000); // ideally use WebDriverWait
        }

    }
}
