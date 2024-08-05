package Day2;

public class Logic_fourth {
    public static void main(String[] args) {
        int num = 1234; // Replace with your desired number
        int reversed = 0;
        System.out.println("Original Number: " + num);
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed Number: " + reversed);
    }
}
