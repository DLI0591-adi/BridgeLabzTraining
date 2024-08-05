package Day2;

import java.util.Arrays;

public class String_Programs {
    public static void main(String[] args) {
        String str = "Radar";
        int strLength = str.length();
        palindrome(str,strLength);
        anagram();
        charFreq();
        longestUniqueSubsttr("abcabba");
    }
    private static void charFreq()
    {
        String freqStr = "java program";;
        int i;
        int[] charFreq = new int[256];
        for(i = 0; i < freqStr.length(); i++)
        {
            charFreq[freqStr.charAt(i)]++;
        }
        for(i = 0; i < 256; i++) {
            if(charFreq[i] != 0) {
                System.out.format("\n'%c' Character Occurs %d Times ", i, charFreq[i]);
            }
        }
    }

    private static void anagram() {
        String str1 = "Race";
        String str2 = "Care";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if(str1.length() == str2.length()) {
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            boolean result = Arrays.equals(charArray1, charArray2);
            if(result) {
                System.out.println(str1 + " and " + str2 + " are anagram.");
            }
            else {
                System.out.println(str1 + " and " + str2 + " are not anagram.");
            }
        }
        else {
            System.out.println(str1 + " and " + str2 + " are not anagram.");
        }
    }

    private static void palindrome(String str, int strLength) {
        StringBuilder reverseStr = new StringBuilder();
        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr.append(str.charAt(i));
        }
        if (str.equalsIgnoreCase(reverseStr.toString())) {
            System.out.println(str + " is a Palindrome String.");
        }
        else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }

    public static void longestUniqueSubsttr(String str)
    {
        int n = str.length();
        int res = 0;
        for(int i = 0; i < n; i++)
        {
            boolean[] visited = new boolean[256];
            for(int j = i; j < n; j++)
            {
                if (visited[str.charAt(j)])
                    break;
                else
                {
                    res = Math.max(res, j - i + 1);
                    visited[str.charAt(j)] = true;
                }
            }
            visited[str.charAt(i)] = false;
        }
        System.out.println("\nThe length of the longest " +
                "non-repeating character " +
                "substring is " + res);
    }
}

