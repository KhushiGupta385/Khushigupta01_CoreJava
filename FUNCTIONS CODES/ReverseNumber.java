//Write a method reverse(int n) that returns the reverse of a number
public class ReverseNumber {

    static int reverse(int n) {
        int rev = 0;

        while (n != 0) {
            int digit = n % 10;      // last digit nikalna
            rev = rev * 10 + digit;  // reverse build karna
            n = n / 10;             // number chhota karna
        }

        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1234)); // 4321
        System.out.println(reverse(500));  // 5
        System.out.println(reverse(987));  // 789
    }
}