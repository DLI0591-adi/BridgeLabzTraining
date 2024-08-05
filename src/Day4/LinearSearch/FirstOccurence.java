package Day4.LinearSearch;

import java.util.ArrayList;

public class FirstOccurence {
    static int firstOccurence(ArrayList<Integer> x, int num){
        for(int i=0;i<x.size();i++) {
            if(x.get(i)==num)return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(5);
        System.out.println(firstOccurence(arr,3));
    }
}
