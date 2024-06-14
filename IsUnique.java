import java.util.Arrays;

/**
 * Implement an algorithm to determine if a string has all unique characters. What if you cannot
 * use additional data structures?
 */

public class IsUnique {
    public static void main(String[] args) {
        String test = "hello";
        System.out.println(isUnique(test));
    }
    public static boolean isUnique(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        for (int i = 0; i < charArray.length - 1; i++) {
            if (charArray[i] == charArray[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
