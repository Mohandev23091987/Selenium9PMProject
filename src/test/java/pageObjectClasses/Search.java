package pageObjectClasses;

import basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search extends BasePage {

    //constructor
    public Search(WebDriver driver){
       super(driver);
    }

    //locators





    @FindBy (xpath ="//span[text()='My Account']") WebElement link_MyAccount;

    @FindBy (xpath ="//a[text()='Register']")
    WebElement link_Register;

    @FindBy (xpath ="//a[text()='Login']")
    WebElement link_Login;

    @FindBy (xpath ="//a[text()='Logout']")
    WebElement link_Logout;




    //methods




    public void clickOnMyAccount(){
        link_MyAccount.click();
    }

    public void clickOnRegister(){
        link_Register.click();
    }

    public void clickOnLogin(){
        link_Login.click();
    }

    public void clickOnLogout(){
        link_Logout.click();
    }


}
