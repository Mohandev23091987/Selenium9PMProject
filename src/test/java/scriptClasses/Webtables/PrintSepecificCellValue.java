package scriptClasses.Webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintSepecificCellValue {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/web-table-element.php");

//        WebElement cell = driver.findElement(By.xpath("//table[@class='dataTable']//tbody/tr[3]/td[2]"));
//        System.out.println("Cell Data: " + cell.getText());


        System.out.println(driver.findElement(By.xpath("//table//tbody/tr[6]/td[1]")).getText());


    }
}
