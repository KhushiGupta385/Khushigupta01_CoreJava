//Write a recursive method to find factorial of a number.
public class FactorialRecursive {

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;   // base condition
        }
        return n * factorial(n - 1);  // recursive call
    }

    public static void main(String[] args) {
        System.out.println(factorial(5)); // 120
        System.out.println(factorial(4)); // 24
    }
}