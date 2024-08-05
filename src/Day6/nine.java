package Day6;

import java.util.Scanner;

interface Number{
    int square(int num);

    default void calculateSquare(int num){
        System.out.println("The square of the number is : "+square(num));
    }
}

public class nine {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number  : ");
        int num = scanner.nextInt();
        Number number = (int n) -> n*n;
        number.calculateSquare(num);

    }
}
