package scriptClasses.LoginFactory;

import org.testng.annotations.Factory;

public class FactoryClass {
    @Factory
    public Object[] createInstances() {
        return new Object[]{
                new LoginTest("user1", "pass1"),
                new LoginTest("user2", "pass2"),
                new LoginTest("user3", "pass3")
        };
    }
}
