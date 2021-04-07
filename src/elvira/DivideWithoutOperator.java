package elvira;

public class DivideWithoutOperator {

    public static void main(String[] args) {

        divide(10, 3);

    }
 /*
    Write a method that can divide two numbers without using division operator
     */

    public static void divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Invalid number");
            return;
        }

        int result = 0;
        while (num1 >= num2) {
            num1 -= num2;
            result++;
        }
        System.out.println(result + " with the remainder of " + num1);
    }


}
