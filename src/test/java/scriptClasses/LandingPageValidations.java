package scriptClasses;

import baseTest.BaseTestClass;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjectClasses.HomePage;
import pageObjectClasses.LandingPage;
import pageObjectClasses.LoginPageClass;
import utilities.DataProviders;

public class LandingPageValidations extends BaseTestClass {


//    @Test(groups = {"smoke"}, dataProvider = "LoginData", dataProviderClass = DataProviders.class)
//    public void verifyLoginWithDifferentCredentials(String username, String password, String expectedResult) {
//        logger.info("Login with Different Credentails Test Started");
//        //create object of HomePage
//        HomePage homePage = new HomePage(driver);
//        //click on MyAccount
//        homePage.clickOnMyAccount();
//        //click on login
//        homePage.clickOnLogin();
//
//        LoginPageClass loginPage = new LoginPageClass(driver);
//
//        loginPage.performLogin(username, password);
//
//        LandingPage landingPage = new LandingPage(driver);
//        boolean found = landingPage.verifyLandingPageDisplay();
//
//        if (expectedResult.equalsIgnoreCase("valid")) {
//            logger.error("Login is  successful");
//            Assert.assertTrue(found, "Login is not successful ");
//            //logout
//            homePage.clickOnMyAccount();
//            homePage.clickOnLogout();
//
//        } else {
//            logger.info("Login is not successful");
//            Assert.assertFalse(found, "Login is successful ");
//        }
//
//    }
//

    @Test(groups = {"LandingPage", "P1"})
    public void verifySectionsInLandingPage() {
        logger.info("Login with Different Credentails Test Started");
        //create object of HomePage
        HomePage homePage = new HomePage(driver);
        //2. Click on “My Account” and choose “Login”
        homePage.clickOnMyAccount();

        //click on login
        homePage.clickOnLogin();

        LoginPageClass loginPage = new LoginPageClass(driver);
//Step 3: Enter valid email and password
// 4. Click on “Login” button
        loginPage.performLogin(proObject.getProperty("email"), proObject.getProperty("password"));
        LandingPage landingPage = new LandingPage(driver);
        boolean found = landingPage.verifyLandingPageDisplay();
        //5. Verify that you are redirected to the Account Landing Page
        Assert.assertTrue(found);

        //6. Verify the presence of the following sections:

        Assert.assertTrue(false);
        Assert.assertEquals(landingPage.verifyMyAccountSeciton(), true, "Account section is not diplayed");

        Assert.assertEquals(landingPage.verifyMyOrdersSeciton(), true, "My Orders section is not diplayed");

        Assert.assertEquals(landingPage.verifyAffiliateAccountSeciton(), true, "Affiliate Account section is not diplayed");

        Assert.assertEquals(landingPage.verifyNewsLetterSeciton(), true, "News Letter section is not diplayed");


    }


}
