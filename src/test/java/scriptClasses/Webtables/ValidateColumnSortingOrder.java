package scriptClasses.Webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ValidateColumnSortingOrder {


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/web-table-element.php");


        List<WebElement> columnCells = driver.findElements(By.xpath("//table[@class='dataTable']//tbody/tr/td[2]"));
        List<String> originalList = new ArrayList<>();
        for (WebElement cell : columnCells) {
            originalList.add(cell.getText());
        }

        List<String> sortedList = new ArrayList<>(originalList);
        Collections.sort(sortedList);

        System.out.println("Is Column Sorted? " + originalList.equals(sortedList));

    }
}
