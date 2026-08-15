//Print the harmonic series up to N terms.
public class HarmonicSeries {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        double sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("1/" + i);

            if (i < n) {
                System.out.print(" + ");
            }

            sum = sum + (1.0 / i);
        }

        System.out.println();
        System.out.println("Sum = " + sum);

        sc.close();
    }
}