//Write a method isPrime(int n) that returns whether a number is prime or not
public class PrimeCheck {

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(7));  // true
        System.out.println(isPrime(10)); // false
        System.out.println(isPrime(2));  // true
    }
}