package elvira;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestPalindrome {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("r", "cat", "anna", "hannah"));
        System.out.println("longestPalindrome(words) = " + longestPalindrome(words));
    }

    public static String longestPalindrome(ArrayList<String> words) {
        String longest = "";

        for (String word : words) {

            if (word.length() > longest.length()) {
                if (isPalindrome(word))
                    longest = word;
            }
        }

        return longest;
    }

    public static boolean isPalindrome(String str) {

        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

}
