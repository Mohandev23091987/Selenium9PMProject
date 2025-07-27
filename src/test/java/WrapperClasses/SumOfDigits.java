package WrapperClasses;

public class SumOfDigits {

    public static void main(String[] args) {
        String num = "12345";
        int sum =0;

        for(char c : num.toCharArray()){

           sum = sum + Character.getNumericValue(c);

        }

        System.out.println(sum);

    }
}
