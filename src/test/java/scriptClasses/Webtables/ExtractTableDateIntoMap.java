package scriptClasses.Webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExtractTableDateIntoMap {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/web-table-element.php");
        Map<String, String> companyPriceMap = new HashMap<>();

        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']//tbody/tr"));

        for (WebElement row : rows) {
            String company = row.findElement(By.xpath("td[1]")).getText();
            String price = row.findElement(By.xpath("td[4]")).getText(); // assuming 4th column is price
            companyPriceMap.put(company, price);
        }

        System.out.println(companyPriceMap);

    }
}
