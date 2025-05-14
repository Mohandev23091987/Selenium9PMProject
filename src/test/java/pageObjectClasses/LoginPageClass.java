package pageObjectClasses;

import basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageClass extends BasePage {

    //Constructor
    public LoginPageClass(WebDriver driver) {
        super(driver);
    }

    //WebElements

    @FindBy(xpath ="//input[@id='input-email']")
    WebElement input_Email;

    @FindBy (xpath ="//input[@id='input-password']")
    WebElement input_Password;

    @FindBy (xpath ="//input[@type='submit']")
    WebElement btn_Login;

    //Methods

    public void performLogin(String email, String password) {
        input_Email.clear();
        input_Email.sendKeys(email);
        input_Password.clear();
        input_Password.sendKeys(password);
        btn_Login.click();
    }






}
