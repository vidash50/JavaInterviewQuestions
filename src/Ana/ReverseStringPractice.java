package Ana;

import java.util.Scanner;

public class ReverseStringPractice {


    public static void main(String[] args) {
        String init;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please , enter a string to reverse");
        init = scan.nextLine();

        System.out.println("Reversed string is: " + reverseString(init));
        scan.close();
    }


    public static String reverseString(String  str) {

        String reverse = "";

        for (int i = str.length(); i >0; i--) {

            reverse += str.charAt(i-1);

        }
        return reverse;

    }
}
















