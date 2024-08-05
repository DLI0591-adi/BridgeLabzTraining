package Day4.BinarySearch;

import java.util.Scanner;

public class SquareRootOfANumber {
    static int sqrt(int num){
        int start=1,end=num/2;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid*mid<num)start=mid+1;
            else if(mid*mid==num)return mid;
            else end=mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if(n==1) System.out.println("1");
        else if(sqrt(n)==-1) System.out.println("The number has not integer square root");
        else System.out.println(sqrt(n));
    }
}
