package Ana;

import java.util.Scanner;

public class NumberDivideWithoutDivision {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter first number :");
        num1 = sc.nextInt();
        System.out.println("Please, enter second Number : ");
        num2 = sc.nextInt();

        divide(num1,num2);

    }

    public static void   divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Invalid Number ");
            return;
        }
        System.out.print(num1 + " divided by " + num2 + " is: ");

        int quotient = 0;

        while (num1 >= num2) {//
            num1 -= num2;
            quotient++;
        }


        System.out.println(quotient + " and the remainder is : " + num1);
    }
}

