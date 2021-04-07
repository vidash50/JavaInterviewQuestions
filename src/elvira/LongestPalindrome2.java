package elvira;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestPalindrome2 {


    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("level", "aa", "a", "non", "Racecar", "radar", "cyberte", "noon", "racecar", "cybertek"));
        System.out.println(smallestPalindrome(words));
        System.out.println(largestPalindrome(words));

    }

    public static String largestPalindrome(ArrayList<String> words) {
        String largest = "";
        int maxWordLength = words.get(0).length();

        for (String eachWord : words) {
            if (eachWord.length() > maxWordLength) {
                if (isPalindrome(eachWord.toLowerCase())) {
                    maxWordLength = eachWord.length();
                }
            }
        }
        for (String eachWord : words) {
            if (eachWord.length() == maxWordLength) {
                if (isPalindrome(eachWord.toLowerCase())) {
                    largest += eachWord + " ";
                }
            }
        }
        return largest;
    }

    public static String smallestPalindrome(ArrayList<String> words) {
        String smallest = "";
        int minWordLength = words.get(0).length();

        for (String eachWord : words) {
            if (eachWord.length() < minWordLength) {
                if (isPalindrome(eachWord.toLowerCase()))
                    minWordLength = eachWord.length();
            }
        }

        for (String eachWord : words) {
            if (eachWord.length() == minWordLength) {
                if (isPalindrome(eachWord.toLowerCase()))
                    smallest += eachWord + " ";

            }
        }
        return smallest;

    }

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }



}
