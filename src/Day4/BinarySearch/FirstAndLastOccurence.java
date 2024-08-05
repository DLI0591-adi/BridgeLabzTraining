package Day4.BinarySearch;

public class FirstAndLastOccurence {
    static int firstOccurence(int[] arr,int el){
        int x=-1;
        int start =0,end=arr.length-1;
        while(start<end){
            int mid=start+(end-start/2);
            if(arr[mid]==el){
                x=mid;
                end=mid-1;
            }
            else if(arr[mid]>el)end=mid-1;
            else start=mid+1;
        }
        return x;
    }
    static int lastOccurence(int[] arr,int el){
        int start =0,end=arr.length-1;
        int x=-1;
        while(start<end){
            int mid=start+(end-start/2);
            if(arr[mid]==el){
                x=mid;
                start=mid+1;
            }
            else if(arr[mid]>el)end=mid-1;
            else start=mid+1;
        }
        return x;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,5,7,8,9,12,15,17,18,7,26};
        System.out.println(firstOccurence(arr,7));
        System.out.println(lastOccurence(arr,7));
    }
}
