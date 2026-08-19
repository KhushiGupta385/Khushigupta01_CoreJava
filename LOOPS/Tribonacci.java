//Print Tribonacci series (like Fibonacci but sum of 3 previous). 
public class Tribonacci {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1, c = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int next = a + b + c;
            a = b;
            b = c;
            c = next;
        }

        sc.close();
    }
}