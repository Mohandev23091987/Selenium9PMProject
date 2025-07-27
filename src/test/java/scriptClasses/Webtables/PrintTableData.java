package scriptClasses.Webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PrintTableData {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/web-table-element.php");

        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']//tbody/tr"));

        for(WebElement row : rows){

            List<WebElement> allCols = row.findElements(By.tagName("td"));

            for(WebElement cell:allCols){
                System.out.print(cell.getText()+ "\t");
            }
            System.out.println();

        }
        driver.close();
    }


}
