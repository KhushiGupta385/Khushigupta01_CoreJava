// Print the sum of squares of first N natural numbers
public class SumOfSquares {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + (i * i);
        }

        System.out.println("Sum of squares of first " + n + " natural numbers = " + sum);

        sc.close();
    }
}