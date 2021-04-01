package Vida;

import java.util.ArrayList;
import java.util.Arrays;

public class LargestPalindrome {

    public static void main(String[] args) {

        ArrayList<String> elements = new ArrayList<>(Arrays.asList("racecar, anna book "));
        System.out.println("largestPalindrome(elements) = " + largestPalindrome(elements));

    }

    /*

    // static call static


     */

    public static String largestPalindrome(ArrayList<String >words){

        String largestStr = "";
        for (String word: words){
            if (word.length()> largestStr.length()){ // this is going to check the length of the word
                if (isPalindrome(word)){
                    largestStr = word; // the largest string is equal to the element

                }
            }
        }
        return largestStr;
    }

    public static boolean isPalindrome(String str) { //this is a helper method that will check whether the word is a palindrome or not

        for (int i = 0;i < str.length()/2; i++) {// this loop will divide the word into two
           if (str.charAt(i) != str.charAt(str.length()-1-1)){ // 'i' will compare the last character of string with the first character of the string
               // and if it's not the same or doesn't match
               return false;// it's not a palindrome
           }
        }
        return true;
    }

    // this helper method is like utility class which is called anytime we need it.



}
