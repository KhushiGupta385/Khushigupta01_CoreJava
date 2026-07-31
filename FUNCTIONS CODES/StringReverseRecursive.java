// Write a recursive method that reverses a string.
public class StringReverseRecursive {

    static String reverse(String str) {
        if (str.isEmpty()) {
            return str;   // base case
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello")); // olleh
        System.out.println(reverse("java"));  // avaj
    }
}