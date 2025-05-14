package pageObjectClasses;

import basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {

    //constructor
    public LandingPage(WebDriver driver){
        super(driver);
    }

    //locators
    @FindBy(xpath ="//h2[text()='My Orders']")
    WebElement pgTitle_MyOrders;


    @FindBy(xpath ="//h2[text()='My Account']")
    WebElement section_MyAccount;

    @FindBy(xpath ="//h2[text()='My Orders']")
    WebElement section_MyOrders;

    @FindBy(xpath ="//h2[text()='My Affiliate Account']")
    WebElement section_Affiliate_Account;

    @FindBy(xpath ="//h2[text()='Newsletter']")
    WebElement section_NewsLetter;



    //methods
    public boolean verifyLandingPageDisplay(){
        try {
            return pgTitle_MyOrders.isDisplayed();
        }
        catch (Exception e){
            return false;
        }
    }

    public boolean verifyMyAccountSeciton(){
        try{
         return section_MyAccount.isDisplayed();
        }
        catch (Exception e){
            return false;
        }
    }

    public boolean verifyMyOrdersSeciton(){
        try{
         return section_MyOrders.isDisplayed();
        }
        catch (Exception e){
            return false;
        }
    }

    public boolean verifyAffiliateAccountSeciton(){
        try{
         return section_Affiliate_Account.isDisplayed();
        }
        catch (Exception e){
            return false;
        }
    }

    public boolean verifyNewsLetterSeciton(){
        try{
         return section_NewsLetter.isDisplayed();
        }
        catch (Exception e){
            return false;
        }
    }

}
