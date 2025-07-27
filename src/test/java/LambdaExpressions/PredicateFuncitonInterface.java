package LambdaExpressions;

import org.apache.poi.ss.formula.functions.T;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateFuncitonInterface {

    public static void main(String[] args) {
        Predicate<String> p0 = s-> (s.equals("Selenium"));
        boolean result1 = p0.test("mohan");
        System.out.println(result1);

        Predicate<Integer> p1 = i-> (i <10);
        boolean result2 = p1.test(5);
        System.out.println(result2);


        ArrayList<String> names = new ArrayList<>();
        names.add("mohan");
        names.add("Ravi");
        names.add("Akash");
        names.add("Raman");

        System.out.println("names :"+names);

        names.removeIf(name ->(name.equals("mohan")));
        System.out.println("names after deletion  :"+names);




    }


}
