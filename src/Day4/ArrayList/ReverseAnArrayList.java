package Day4.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseAnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,4,5,6,5));
        System.out.println(arr);
        for(int i=0;i<arr.size()/2;i++){
            int temp=arr.get(i);
            arr.set(i,arr.get(arr.size()-1-i));
            arr.set(arr.size()-i-1,temp);
        }
        System.out.println(arr);
    }
}