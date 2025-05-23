package scriptClasses;

import baseTest.BaseTestClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjectClasses.HomePage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Registration extends BaseTestClass {


    @Test (groups={"Regression","Smoke"})
    public void registrationTest(){

        logger.info("Registration Test Started");

        //create object of HomePage
        HomePage homePage = new HomePage(driver);
        //click on MyAccount
        homePage.clickOnMyAccount();
        //click on Register
        homePage.clickOnRegister();

        System.out.println("====================="+proObject.getProperty("username")+"=====================");

        logger.warn("Button is not visible please check ");

        logger.debug("Button is not visible please check ");

        logger.error("this is error message");

        logger.fatal("this is fatal message");

    }


}
