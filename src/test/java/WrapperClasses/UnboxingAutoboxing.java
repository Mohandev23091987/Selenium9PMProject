package WrapperClasses;

public class UnboxingAutoboxing {

    public static void main(String[] args) {
        int a=10;
        Integer WrapperA = a;
        System.out.println(WrapperA);  //autoboxing


        Integer WrapperB = 20;
        int b=WrapperB;
        System.out.println(b);  //unboxing
    }
}
