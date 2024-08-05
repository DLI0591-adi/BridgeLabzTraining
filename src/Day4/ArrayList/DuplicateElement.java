package Day4.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateElement {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,4,5,6,5));
        System.out.println(arr);
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.size();j++){
                if(i!=j && arr.get(i) == arr.get(j)){
                    System.out.println(arr.get(i));
                    return;
                }
            }
        }
    }
}