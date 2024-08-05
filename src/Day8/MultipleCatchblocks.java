package Day8;

import java.util.Scanner;
import java.util.InputMismatchException;

public class MultipleCatchblocks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2;
        try{
            n2=sc.nextInt();
            int ans=n1/n2;
            System.out.println(ans);
        }
        catch (ArithmeticException e){
            System.out.println("Divide by zero");
            e.printStackTrace();
        }
        catch (InputMismatchException e){
            System.out.println("Input mismatch please enter value of second number an integer only");
            e.printStackTrace();
        }
    }
}
