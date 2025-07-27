package scriptClasses.LoginWithDataProviderFactory;

import org.testng.annotations.Test;

public class LoginTest {
    private String username;
    private String password;

    public LoginTest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Test
    public void testLogin() {
        System.out.println("Testing login with: " + username + " / " + password);
        // add actual test logic here
    }
}
