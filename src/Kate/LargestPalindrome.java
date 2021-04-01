package Kate;

import java.util.ArrayList;
import java.util.Arrays;

    public class LargestPalindrome {
        public static void main(String[] args) {

            ArrayList<String> words = new ArrayList<>(Arrays.asList("level", "radar", "cybertek", "noon", "racecar" ));
            System.out.println(largestPalindrome(words));

        }

        public static String largestPalindrome(ArrayList<String> words) {
            String largestString = "";

            for (String each : words) {
                if (each.length() > largestString.length()) {

                    if (isPalindrome(each)) {
                        largestString = each;
                    }
                }
            }
            return largestString;
        }

        private static boolean isPalindrome(String str) {

            for (int i = 0; i < str.length()/2; i++){

                if(str.charAt(i) != str.charAt(str.length()-1-i)){
                    return false;
                }
            }
            return true;
        }
    }
