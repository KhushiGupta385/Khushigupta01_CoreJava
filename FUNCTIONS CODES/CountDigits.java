//Write a method countDigits(int n) that returns the number of digits.
public class CountDigits {

    static int countDigits(int n) {
        int count = 0;

        if (n == 0) {
            return 1;
        }

        n = Math.abs(n); // negative number handle karne ke liye

        while (n != 0) {
            n = n / 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDigits(1234));  // 4
        System.out.println(countDigits(50));    // 2
        System.out.println(countDigits(0));     // 1
        System.out.println(countDigits(-9876));  // 4
    }
}
