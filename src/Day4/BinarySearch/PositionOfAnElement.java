package Day4.BinarySearch;

public class PositionOfAnElement {
    static int indexOfElement(int[] arr,int el){
        int start =0,end=arr.length-1;
        while(start<end){
            int mid=start+(end-start/2);
            if(arr[mid]==el)return mid+1;
            else if(arr[mid]>el)end=mid-1;
            else start=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,8,9,12,15,17,18,23,26};
        System.out.println(indexOfElement(arr,9));
    }
}