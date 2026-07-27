// Write a method isArmstrong(int n) that checks whether a number is an Armstrong number.
public class ArmstrongCheck {

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum = sum + (digit * digit * digit);
            n = n / 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153)); // true
        System.out.println(isArmstrong(370)); // true
        System.out.println(isArmstrong(123)); // false
    }
}