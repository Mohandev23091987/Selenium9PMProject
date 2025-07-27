package scriptClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGPractice {

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void test1(){
        System.out.println("execution ");
        Assert.assertTrue(false);
    }
}
