package scriptClasses.LoginWithDataProviderFactory;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import scriptClasses.LoginFactory.LoginTest;

public class LoginFactoryWithTestNg {
    @Factory(dataProvider = "loginData")
    public Object[] createInstances(String username, String password) {
        return new Object[]{
                new LoginTest(username, password)
        };
    }

    @DataProvider
    public Object[][] loginData() {
        return new Object[][]{
                {"user1", "pass1"},
                {"user2", "pass2"},
                {"user3", "pass3"}
        };
    }
}
