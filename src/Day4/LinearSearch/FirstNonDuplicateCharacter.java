package Day4.LinearSearch;

import java.util.Scanner;

public class FirstNonDuplicateCharacter {
    static char nonDuplicateCharacter(String s){
        for(int i=0;i<s.length();i++){
            boolean found = true;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)&&i!=j) {
                    found=false;
                    break;
                };
            }
            if(found)return s.charAt(i);
        }
        return s.charAt(0);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = scn.nextLine();
        System.out.println(nonDuplicateCharacter(s));
    }
}
