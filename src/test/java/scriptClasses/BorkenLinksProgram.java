package scriptClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BorkenLinksProgram {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/broken-links.php");
        driver.manage().window().maximize();

        List<WebElement> alllinks =driver.findElements(By.tagName("a"));

        for(WebElement link : alllinks){

            String url = link.getDomAttribute("href");

            if(url==null || url.isEmpty()){
                System.out.println("url is empty");
                continue;
            }

            try {
                HttpURLConnection conObject= (HttpURLConnection)(new URL(url).openConnection());
                conObject.setRequestMethod("GET");
                conObject.connect();
                int responseCode = conObject.getResponseCode();

                if(responseCode>=400){
                    System.out.println("Broken link is "+url+ " responseCode:"+responseCode);
                }

            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }

        }




    }
}
