package Kate;

import java.util.ArrayList;
import java.util.Arrays;

public class PresentationTask {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("level", "aa", "a", "non", "Racecar", "radar", "cyberte", "noon", "racecar", "cybertek"));
        System.out.println(smallestPalindrome(words));
        System.out.println(largestPalindrome(words));
    }

    public static String smallestPalindrome(ArrayList<String> words) {
        String result = "";
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
                    result += eachWord + " ";

            }
        }
        return result;

    }

    public static String largestPalindrome(ArrayList<String> words) {
        String result = "";
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
                    result += eachWord + " ";
                }
            }
        }
        return result;
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
