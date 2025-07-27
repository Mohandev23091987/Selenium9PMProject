package WrapperClasses;

public class addNumberinAstring {

    public static void main(String[] args) {
        String num = "1k2c3k4g5";
        int sum =0;

        for(char c : num.toCharArray()){

            if(Character.isDigit(c)){
                sum = sum + Character.getNumericValue(c);
            }


        }

        System.out.println(sum);

//        char ch='7';
//
//        if(Character.isDigit(ch)){
//            System.out.println(ch+"its a digit");
//        }else if (Character.isAlphabetic(ch))
//        {
//            System.out.println(ch+"its a character");
//        }

        Integer a = 20;
        Integer b = 30;
        Integer c = a+b;
        System.out.println(c);

        String ch = "A";
        System.out.println(ch+1);

        Integer m = null;
        int n = m;

        System.out.println(n);



    }
}
