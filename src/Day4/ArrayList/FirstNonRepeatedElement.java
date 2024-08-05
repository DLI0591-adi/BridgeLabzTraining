package Day4.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class FirstNonRepeatedElement {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,4,5,1,3,7,5));
        System.out.println(arr);
        for(int i=0;i<arr.size()-1;i++){
            boolean flag=false;
            for(int j=0;j<arr.size()-1;j++){
                if(i!=j&& Objects.equals(arr.get(i), arr.get(j))){
                    flag=true;
                    break;
                }
            }
            if(!flag) {
                System.out.println(arr.get(i));
                return;
            }
        }
    }
}