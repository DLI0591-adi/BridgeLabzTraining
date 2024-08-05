package Day4.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchElementInRotatedArray {
    static int pivot(int[] arr){
        int start=0,end = arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(mid+1<end&&arr[mid]>arr[mid+1])return mid;
            if(mid-1>start&&arr[mid-1]>arr[mid])return mid-1;
            if(arr[mid]>arr[start])start=mid+1;
            else end=mid-1;
        }
        return -1;
    }
    static boolean searchElement(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)return true;
            else if(arr[mid]>target)end=mid-1;
            else start = mid+1;
        }
        return false;
    }
    static int[] rev(int[] arr,int start,int end){
        for(int i=start;i<=start+(end-start)/2;i++){
            int temp=arr[i];
            arr[i]=arr[end+start-i];
            arr[end+start-i]=temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("Please Input the size of the Array");
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        System.out.println("Please input the array elements");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        System.out.println("Please input the position from where you want to rotate");
        int rotPosition=scn.nextInt();
        int len= arr.length-1;
        rev(arr,0,len-rotPosition);
        rev(arr,len-rotPosition+1,len);
        rev(arr,0,len);
        System.out.println("Now the rotated array is "+ Arrays.toString(arr));
        System.out.println("Enter the element to search");
        int target=scn.nextInt();
        int pivot=pivot(arr);
        if(pivot==-1) System.out.println(searchElement(arr,target,0,len));
        if(arr[pivot]==target) System.out.println("True");
        else if(arr[0]>target) System.out.println(searchElement(arr,target,pivot+1,len));
        else System.out.println(searchElement(arr,target,0,pivot-1));
    }
}
