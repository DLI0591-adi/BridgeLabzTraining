package Day6;

import java.util.Scanner;

@FunctionalInterface
interface Sum{
    int sum(int a,int b);
}

public class one {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter two number ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Sum c = (int x,int y)-> x+y;
        System.out.println(c.sum(a,b));
    }
}