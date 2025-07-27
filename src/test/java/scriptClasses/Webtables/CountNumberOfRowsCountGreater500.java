package scriptClasses.Webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CountNumberOfRowsCountGreater500 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/web-table-element.php");
        int count = 0;
//        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']//tbody/tr"));
//
//        for (WebElement row : rows) {
//            String priceText = row.findElement(By.xpath("td[4]")).getText(); // assuming 4th column = price
//            double price = Double.parseDouble(priceText.replace(",", ""));
//            if (price > 500) {
//                count++;
//            }
//        }
//        System.out.println("Number of companies with price > 500: " + count);

        List<WebElement> columnValues = driver.findElements(By.xpath("//table[@class='dataTable']//tbody/tr/td[4]"));

            for(WebElement col:columnValues ){
                double price = Double.parseDouble(col.getText().replace(",", ""));
            if (price > 500) {
               count++;
          }
            }
        System.out.println("Number of companies with price > 500: " + count);


    }
}
