package Day4.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(10,20,3,4,5));
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
    }
}
