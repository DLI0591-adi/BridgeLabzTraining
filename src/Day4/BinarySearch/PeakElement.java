package Day4.BinarySearch;

public class PeakElement {
    public static void main(String[] args) {
        int []arr={1,3,8,12,4,2};

        System.out.println("Peak element is at index "+peak(arr));
    }
    public  static int peak(int []arr){
        int low =0, high =arr.length-1;

        while(low < high){
            int mid = low+(high-low)/2;
            if(arr[mid]<arr[mid+1]){
                low =mid+1;
            }
            else{
                high =mid;
            }

        }
        return low;
    }
}