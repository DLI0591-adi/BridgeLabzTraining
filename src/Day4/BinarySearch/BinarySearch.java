package Day4.BinarySearch;

public class BinarySearch {
    static int binarySearch(int[] arr,int n){
        int start =0,end=arr.length-1;
        while(start<end){
            int mid=(start+end)/2;
            if(arr[mid]==n)return mid;
            else if(arr[mid]>n)end=mid-1;
            else start=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,8,9,12,15,17,18,23,26};
        System.out.println(binarySearch(arr,9));
    }
}