package LambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparableProgram {

    public static void main(String[] args) {


        Comparator<Integer> com = (o1,  o2) -> o1 % 10 < o2 % 10?1:-1;


        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(48);
        nums.add(91);
        nums.add(73);
        nums.add(85);
        //91  73  85 48

        System.out.println("nums :"+nums);

        Collections.sort(nums);

        System.out.println("After sorting :"+nums);



        Collections.sort(nums, Comparator.reverseOrder());
        System.out.println("Print in descending order"+nums);


        Collections.sort(nums,com);

        System.out.println("sort using second digit in number"+nums);

//student calls

    }
}
