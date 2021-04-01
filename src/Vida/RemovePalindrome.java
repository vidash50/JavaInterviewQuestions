package Vida;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class RemovePalindrome {

    public static void main(String[] args) {

        String[] names = {"Anna", "Nalan", "Hannah", "Emma", "Aidai", "Ciris", "Yasin", "Bob", "Inna", "Eve"};

        int countPalindromes = 0;// this will count the palindromes that are in the array



        for(int j = 0; j <= names.length-1; j++){// the j in the loop represent every element in the array

            String original = names[j]; //"Anna"
            String reversed = "";// will contain the reversed version of the first element(Anna)

            // I need the original string of the first element to be able to iterate through the element
            for(int i = original.length()-1; i>= 0; i--){// in other to check whether the name is palindrome or not, I have to reverse the string backwards
                reversed += original.charAt(i);// this will give the reversed version of the first element which is (ANNA)
            }

            if(original.equalsIgnoreCase(reversed)){// this condition will check if the original string is palindrome or not and if the condition is true then --
                countPalindromes++; // increase the number of count by 1 if the string is palindrome
                System.out.println(original); // this will print all the names that are palindrome
            }

        }

        /*

        System.out.println("countPalindromes = " + countPalindromes);// this will print the count

        System.out.println("======================================================");

       // Scanner scan = new Scanner(System.in);

        //System.out.println("Enter a string: ");
        String word = "Anna";//scan.nextLine();

        String result = ""; // this will be the result of the word

        for(int i = word.length()-1; i >= 0; i-- ){ // get the characters in backwards or iterate through the word(string) from highest possible number to the lowest
            result  +=  word.charAt(i);// 'i' represent the string(word) which is been concated to the result
        }

        System.out.println("result: " + result);

        if( result.equalsIgnoreCase(word) ) { // if this condition is true
            System.out.println(word + " is palindrome");// it is palindrome
        }else{ //otherwise
            System.out.println(word + " is not palindrome ");// it is not palindrome
        }

        System.out.println("-------------------------------------------");


        String word2 = "dad";
        String result2 = "";

        for (int j = word2.length()-1; j >= 0; j--){
            result2 += word2.charAt(j);
        }
        System.out.println(result2);

        if (result.equalsIgnoreCase(word2)){
            System.out.println(" is a palindrome");
        }else {
            System.out.println("not palindrome");
        }

        System.out.println("-----------------==================--------------------------");

        System.out.println("isPalindrome(\"racecar\") = " + isPalindrome("racecar"));

      //  List<String > list = Arrays.asList(names);

         */


    }

      /*
        remove palindrome strings from a List of String
    */

    //solution 1:
    public List<String> removePalindromes1(List<String> list) {
        Iterator<String> it = list.iterator();// iterate through the string(word)
        while (it.hasNext()) { // repeated if statement so whiles the list(words) has next words --> continue iterating
            String word = it.next();// this will contain the words
            String reversed = ""; // this will later contain the reversed version of the words
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed += word.charAt(i);
            }
            if (word.equalsIgnoreCase(reversed)) {
                it.remove();
            }
        }
        return list;
    }



    //solution 2:
    public List<String> removePalindromes2(List<String> list) {
        list.removeIf(p -> isPalindrome(p));
        return list;
    }

    public static boolean isPalindrome(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed.equalsIgnoreCase(str);
    }
}
