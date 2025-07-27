package LambdaExpressions;

import java.util.Scanner;

public class CalculatorClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pelase enter first number");
        double number1 = scanner.nextDouble();


        System.out.println("pelase enter second number");
        double number2 = scanner.nextDouble();

        Operation obj2 = (a, b)->{
            System.out.println("sum is "+ (a+b));
            System.out.println("product is "+ (a*b));
            System.out.println("Division is "+ (a/b));
            System.out.println("Difference is "+ (a-b));

        };

        obj2.performOperation(number1,number2);
    }



}
