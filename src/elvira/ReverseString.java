package elvira;

public class ReverseString {
    /*
    Objects of String are immutable, and objects of StringBuffer
    and StringBuilder are mutable. StringBuffer and StringBuilder
    are similar, but StringBuilder is faster and preferred
    over StringBuffer for the single-threaded program.
    If thread safety is needed, then StringBuffer is used.
     */
    public static void main(String[] args) {
        String str = "Java";//avaJ
        System.out.println("reversedStr(str) = " + reversedStr(str));
        System.out.println("reversedStr2(str) = " + reversedStr2(str));
    }


    public static String reversedStr(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);//str.toCharArray()[i];
        }
        return reversed;
    }


    public static String reversedStr2(String str) {

        return new StringBuilder(str).reverse().toString();
    }
}
