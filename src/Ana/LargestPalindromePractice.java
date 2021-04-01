package Ana;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class LargestPalindromePractice {
    public static void main(String[] args) {
        String str = "Dad  ana mam  a aa mam dad";
        String str1[] = str.split(" ");
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(str1));
        // (Arrays.asList("Minim","racecar","dad","madam","deleveled","example"));

        System.out.println("Largest palindrome word is : " + largestPalindrome(list));

    }

    public static String largestPalindrome(ArrayList<String> list) {
        String longest = "";// where we store biggest palindrome
        String smallest = "";
        int maxlength = 0;
        for (String word : list) {  //we use for each loop we call every element from array  list
            if (word.length() > maxlength) {
                if (checkPalindrome(word)) {  //check if is palindrome
                    maxlength = word.length();  //we assign value of word to longest string
                }
            }
        }


        for (String each : list) {
            if (maxlength == each.length()) {
                if (checkPalindrome(each) ){//check if is palindrome
                    longest += each + " ";


                }
            }

        }

        return longest;

    }

    public static boolean checkPalindrome(String word) {
        int n = word.length();

        word = word.toLowerCase(); //making case insensitive

        for (int i = 0; i < n / 2; i++) { //loop to check palindrome
            if (word.charAt(i) != word.charAt(n - 1 - i)) {
                //comparing characters from beggining to end

                return false;  // is not a palindrome
            }
        }
        return true;

    }
}
