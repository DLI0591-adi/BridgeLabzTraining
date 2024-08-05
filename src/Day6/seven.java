package Day6;

import java.util.Scanner;

interface Circle{
    double PI=3.14;
    double area(double radius);
}
public class seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of radius : ");
        double radius=scanner.nextDouble();

        Circle circle = (r)-> Circle.PI * r * r;

        System.out.println("The Area : "+circle.area(radius));
    }
}
