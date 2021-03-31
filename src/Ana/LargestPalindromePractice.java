package Ana;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class LargestPalindromePractice {
    public static void main(String[] args) {
        String str="Hello dad and madam";
        String str1 [] =str.split(" ");
        ArrayList<String > list = new ArrayList<String>(Arrays.asList(str1));
        System.out.println("Longest  palindrome word is : " +largestPalindrome(list));

    }

    public static String largestPalindrome(ArrayList<String> list) {
        String longest = "";// where we store biggest palindrome
        String smallest = "";

        for (String word : list) {  //we use for each loop we call every element from array  list

            if (word.length() > longest.length()) {
                if (checkPalindrome(word)) {  //check if is palindrome
                    longest = word;  //we assign value of word to longest string

                }
            }


        }
        return longest;

    }

    public static boolean checkPalindrome(String word) {
        int n = word.length();

        word = word.toLowerCase(); //making case insensitive

        for (int i = 0; i < n; i++, n--) { //loop to check palindrome
            if (word.charAt(i) != word.charAt(n - 1)) //comparing characters from beggining to end
                return false;  // is not a palindrome
        }
        return true;

    }
}

