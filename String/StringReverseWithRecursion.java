/**
 * Reverse String using recursion
 */
public class StringReverseWithRecursion {

    public static void main(String args[]) {
        String originalString = "This is sample String";
        System.out.println("Original String : " + originalString);
        System.out.println("Reverse String : " + reverse(originalString));
    }

    public static String reverse(String str) {
        if (null == str || str.length() <= 1) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
