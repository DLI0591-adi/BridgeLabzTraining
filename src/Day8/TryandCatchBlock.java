package Day8;

import java.util.Scanner;

public class TryandCatchBlock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        try{
            int ans=100/n;
            System.out.println(ans);
        }
        catch (ArithmeticException e){
            System.out.println("Divide by zero");
        }
    }
}