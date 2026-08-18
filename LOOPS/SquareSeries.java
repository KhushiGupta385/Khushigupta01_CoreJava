//Print 1, 4, 9, 16, … up to N terms.
public class SquareSeries {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print((i * i));

            if (i < n) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}