package Day4.LinearSearch;

import java.util.ArrayList;

public class AllIndices {
        static ArrayList<Integer> countOccurence(int[] arr, int c){
            ArrayList<Integer> x =new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                if(arr[i]==c)x.add(i);
            }
            return x;
        }

        public static void main(String[] args) {
            int[] arr={8,5,9,7,1,4,2,5,9,2,5,7,9,1,4,5};
            System.out.println(countOccurence(arr,5));
        }
}
