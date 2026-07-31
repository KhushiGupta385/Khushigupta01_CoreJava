// Write a recursive method to find: 1 + 2 + 3 + ... + n
public class SumRecursive {

    static int sum(int n) {
        if (n == 1) {
            return 1;   // base case
        }
        return n + sum(n - 1);  // recursive call
    }

    public static void main(String[] args) {
        System.out.println(sum(5)); // 15
        System.out.println(sum(10)); // 55
    }
}