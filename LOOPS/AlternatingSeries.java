//Print the alternating series: 1, -2, 3, -4, … up to N.
public class AlternatingSeries {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0) {
                System.out.print(-i);
            } else {
                System.out.print(i);
            }

            if (i < n) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}