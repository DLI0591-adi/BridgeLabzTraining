package Day4.LinearSearch;

public class StringSearch {
    static int stringSearch(String[] arr,String num){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num)return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        String[] arrayString = {"Hello","Friend","To","Kaise","Hai","Aap","Log"};
        System.out.println(stringSearch(arrayString,"Hai"));
    }
}