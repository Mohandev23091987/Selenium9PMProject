package scriptClasses.Webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SelectTheCheckBoxBasedOnColumnName {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com/table-page");


        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']//tbody/tr"));

        for (WebElement row : rows) {
            String company = row.findElement(By.xpath("td[1]")).getText(); // assuming 1st column is company
            if (company.equalsIgnoreCase("Infosys")) {
                WebElement checkbox = row.findElement(By.xpath("td[1]/preceding-sibling::td//input[@type='checkbox']"));
                checkbox.click();
                break;
            }
        }

    }
}
