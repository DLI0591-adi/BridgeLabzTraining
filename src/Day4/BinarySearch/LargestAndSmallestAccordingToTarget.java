package Day4.BinarySearch;

public class LargestAndSmallestAccordingToTarget {
    static int SmallestNumberThatIsGreaterOrEqualToTarget(int[] arr,int target){
        int x=-1;
        boolean flag = false;
        int start =0,end=arr.length-1;
        while(start<end){
            int mid=start+(end-start/2);
            if(arr[mid]==target){
                x=mid;
                flag=true;
                end=mid-1;
            }
            else if(arr[mid]>target)end=mid-1;
            else start=mid+1;
        }
        if(flag)
            return x;
        else return start;
    }
    static int LargestNumberThatIsSmallerOrEqualToTarget(int[] arr,int target){
        int x=-1;
        boolean flag=false;
        int start =0,end=arr.length-1;
        while(start<end){
            int mid=start+(end-start/2);
            if(arr[mid]==target){
                x=mid;
                flag=true;
                start=mid+1;
            }
            else if(arr[mid]>target)end=mid-1;
            else start=mid+1;
        }
        if(flag)
            return x;
        else return end;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,5,7,8,9,12,15,17,18,25,26};
        System.out.println(SmallestNumberThatIsGreaterOrEqualToTarget(arr,11));
        System.out.println(LargestNumberThatIsSmallerOrEqualToTarget(arr,11));
    }
}
