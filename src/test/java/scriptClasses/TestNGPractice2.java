package scriptClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGPractice2 {

    @Test(expectedExceptions = {ArithmeticException.class, NullPointerException.class})
    public void test2(){
        System.out.println("execution ");
        String str =null;
        System.out.println(str.charAt(0));

        int i=10/0;
        System.out.println("execution end ");

    }
}
