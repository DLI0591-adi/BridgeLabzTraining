package Day4.LinearSearch;

import java.util.Scanner;

public class CountOccurenceInString
{
    static int countOccurence(String s,char c){
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c)count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please Enter the String");
        String s = scn.nextLine();
        System.out.println("Enter the character you want to search in the string");
        char c = scn.next().charAt(0);
        System.out.println("Total count of this character in String is "+ countOccurence(s,c));
    }
}
