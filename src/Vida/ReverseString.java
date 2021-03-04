package Vida;

public class ReverseString {
    public static void main(String[] args) {

        String str = " ABCDEFGH";
        String result = "";

        for (int i = str.length()-1; i >=0; i--){ // i >=0 because the last possible number will be zero, because we are starting from the higher index num to lowest
           char eachCh= str.charAt(i);// i represents the index number of each character in the string. the charAt method allows us to get access to the character in the string
            result += eachCh;//we are concating the character at each index number to the results
        }
        System.out.println(result);// result represent the new reversed string





        System.out.println("=================================================");

        String sentence = "I love java";
        String reverse = "";
       String[] arr =  sentence.split(" ");// split(" ") method create an array that allows us to get access to each word in the sentence.

        for (int j = arr.length-1; j >=0; j--){// we use different method for array length - without parenthesis
            String eachWord = arr[j]+" ";// we needed this +" " to be able to get the the space between the words in the string.
            reverse += eachWord;// array j represents the index of each word in the arr.
        }
        reverse = reverse.trim();// we use trim method because the reverse string will have extra space after it print 'I' or last index.
        System.out.println(reverse);


    }
}
