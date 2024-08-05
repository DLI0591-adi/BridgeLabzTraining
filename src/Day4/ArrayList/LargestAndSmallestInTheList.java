package Day4.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class LargestAndSmallestInTheList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,4,5,6,3,7,5));
        System.out.println(arr);
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (Integer integer : arr) {
            if (integer > max) max = integer;
            if (integer < min) min = integer;
        }
        System.out.println("Minimum Element is "+min);
        System.out.println("Maximum Element is "+max);
    }
}