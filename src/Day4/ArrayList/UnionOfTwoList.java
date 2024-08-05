package Day4.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class UnionOfTwoList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,4,5,6,7));
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(2,3,5,6,7));
        System.out.println(arr);
        System.out.println(arr1);
        for (Integer integer : arr) {
            if (!arr1.contains(integer)) {
                arr1.add(integer);
            }
        }
        System.out.println(arr1);
    }
}