package Day8;

import java.util.Scanner;

class NegativeNumberException extends Exception{
    NegativeNumberException(){
        super("Please enter a positive integer value");
    }
}
public class CustomUchekedException {
    public static void main(String[] args) throws NegativeNumberException {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Enter a number : ");
        num=sc.nextInt();
        if (num<0) throw new NegativeNumberException();
    }
}