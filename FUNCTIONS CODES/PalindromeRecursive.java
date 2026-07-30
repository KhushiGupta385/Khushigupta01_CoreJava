//Write a recursive method that checks whether a string is palindrome.
public class PalindromeRecursive {

    static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;   // base case
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;  // not palindrome
        }

        return isPalindrome(str, start + 1, end - 1);  // recursive call
    }

    public static void main(String[] args) {
        String s1 = "madam";
        String s2 = "hello";

        System.out.println(isPalindrome(s1, 0, s1.length() - 1)); // true
        System.out.println(isPalindrome(s2, 0, s2.length() - 1)); // false
    }
}