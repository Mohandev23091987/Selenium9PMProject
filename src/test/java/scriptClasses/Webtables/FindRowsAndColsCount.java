package scriptClasses.Webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindRowsAndColsCount {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/web-table-element.php");

        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']//tbody/tr"));
        List<WebElement> columns = driver.findElements(By.xpath("//table[@class='dataTable']//thead/tr/th"));

        System.out.println("Total Rows: " + rows.size());
        System.out.println("Total Columns: " + columns.size());



    }
}
