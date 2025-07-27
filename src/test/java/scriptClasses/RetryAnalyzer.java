package scriptClasses;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

    private int retrycount =0;
    private static final int maxRetrycount =2;

    public boolean retry(ITestResult result){
        if(retrycount<maxRetrycount){
            retrycount++;
            return true;
        }
        return false;
    }


}
