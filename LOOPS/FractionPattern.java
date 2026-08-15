//Print the pattern of 1/2 + 2/3 + 3/4 + … up to N terms.
public class FractionPattern {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        double sum = 0;

        for (int i = 1; i <= n; i++) {

            System.out.print(i + "/" + (i + 1));

            if (i < n) {
                System.out.print(" + ");
            }

            sum = sum + (double)i / (i + 1);
        }

        System.out.println();
        System.out.println("Sum = " + sum);

        sc.close();
    }
}