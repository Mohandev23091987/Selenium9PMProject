package scriptClasses.Webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetColumnValuesByHeaderName {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/web-table-element.php");

        int colIndex = 0;
        List<WebElement> headers = driver.findElements(By.xpath("//table[@class='dataTable']//thead/tr/th"));
        for (int i = 0; i < headers.size(); i++) {
            if (headers.get(i).getText().equalsIgnoreCase("Current Price (Rs)")) {
                colIndex = i + 1;
                break;
            }
        }

        List<WebElement> priceCells = driver.findElements(By.xpath("//table[@class='dataTable']//tbody/tr/td[" + colIndex + "]"));
        for (WebElement cell : priceCells) {
            System.out.println(cell.getText());
        }


    }
}
