package Day4.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ListIsPalindromeOrNot {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,4,5,6,5,4,1));
        System.out.println(arr);
        int end=arr.size();
        for(int i=0;i<(end-1)/2;i++){
            if(arr.get(i)!=arr.get(end-i-1)){
                System.out.println("The list is not palindrome");
                return;
            }
        }
        System.out.println("The list is Palindrome");
    }
}
