package WrapperClasses;

public class ConvertStringToInt {

    public static void main(String[] args) {
        String str = "123";

        System.out.println(str+1);

        int num = Integer.parseInt(str);
        System.out.println(num+1);
        String str2 = String.valueOf(num);

    }
}
