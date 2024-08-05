package Day4.LinearSearch;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,8,1,3,7,2,23,5,7,88,4};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        System.out.println("Maximum element in this array is "+ max);
    }
}
