package Day1;

import java.util.Random;
import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        int heads = 0;
        int tails =0 ;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of times a coin is to be flipped.");
        int numberOfFlips = in.nextInt();
        int num=numberOfFlips;
        if(numberOfFlips<0)
            System.out.println("Please enter a positive number.");
        else {
            while(numberOfFlips>0)
            {
                Random random = new Random();
                double ran1 = random.nextDouble(1);
                double ran =  Math.round(ran1 * 10.0) / 10.0;
                if (ran>0.5) {
                    heads++;
                } else {
                    tails++;
                }
                numberOfFlips--;
            }
            double headsPercentage = (double) (heads * 100) / num;
            double tailsPercentage = (double) (tails * 100) / num;
            System.out.println("percentage of heads:" + headsPercentage + "%");
            System.out.println("percentage of tails:" + tailsPercentage + "%");
        }
    }
}

