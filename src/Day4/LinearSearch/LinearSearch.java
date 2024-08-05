package Day4.LinearSearch;

public class LinearSearch {
    static int linearSearch(int[] arr, int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num)return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={2,5,1,8,3,9,7};
        System.out.println(linearSearch(arr,1));
    }
}
