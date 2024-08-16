package Day4.ArrayList;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RotateAnArrayList {
    static void rev(ArrayList<Integer> arr, int k){
        int n = arr.size();
        k = k % n;
        System.out.println(k);
        Collections.reverse(arr);
        Collections.reverse(arr.subList(0, k));
        Collections.reverse(arr.subList(k, n));
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,4,5,6,5));
        System.out.println(arr);
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of rotations :");
        int n = scn.nextInt();
        rev(arr,n);
        System.out.println(arr);
    }
}
