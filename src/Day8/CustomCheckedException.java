package Day8;

import java.util.Scanner;

class InvalidAgeException extends Exception{
    InvalidAgeException(){
        super("Please enter age greater than 18");
    }
}
public class CustomCheckedException {
    public static void main(String[] args) throws InvalidAgeException {
        Scanner sc=new Scanner(System.in);
        int age;
        System.out.println("Enter age : ");
        age=sc.nextInt();
        if(age<18)
            throw new InvalidAgeException();
    }
}