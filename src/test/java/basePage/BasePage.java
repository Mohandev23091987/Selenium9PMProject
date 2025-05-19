package basePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    WebDriver driver;

    //constructor
    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
//add a new line
    }
// adding new comment from Anu
    //new comments changed

    //this is comment added bymohan

    //adding comment
}
