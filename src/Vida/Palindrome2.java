package Vida;

import java.util.Arrays;
import java.util.List;

public class Palindrome2 {

    public static void main(String[] args) {


        // palindrome simply means input and output are the same. When word remains the same when after reversed
         String word = "Anna";
         String  result = "";
         for (int i = word.length()-1; i >= 0; i--){
             result += word.charAt(i);
         }
        System.out.println(result);

         if (result.equalsIgnoreCase(word)){
             System.out.println(word+" is palindrome");

         }else {
             System.out.println(word+" is not palindrome");
         }
        System.out.println("=========================================");





    }
}
