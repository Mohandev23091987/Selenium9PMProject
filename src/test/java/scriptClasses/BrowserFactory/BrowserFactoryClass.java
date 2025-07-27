package scriptClasses.BrowserFactory;

import org.testng.annotations.Factory;

public class BrowserFactoryClass {
    @Factory
    public Object[] browserInstances() {
        return new Object[]{
                new BrowserTest("chrome"),
                new BrowserTest("firefox"),
                new BrowserTest("edge")
        };
    }
}
