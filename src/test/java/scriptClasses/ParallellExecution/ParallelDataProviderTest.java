package scriptClasses.ParallellExecution;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParallelDataProviderTest {
    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password) throws InterruptedException {
        System.out.println("Thread: " + Thread.currentThread().getId() +
                " | Username: " + username + " | Password: " + password);
      Thread.sleep(10000);
    }

    @DataProvider(name = "loginData", parallel = true)
    public Object[][] loginDataProvider() {
        return new Object[][]{
                {"user1", "pass1"},
                {"user2", "pass2"},
                {"user3", "pass3"},
                {"user4", "pass4"}
        };
    }
}
