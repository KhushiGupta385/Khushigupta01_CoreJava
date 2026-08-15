//Print first 10 terms of the geometric progression (GP).
public class GPSeries {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter first term (a): ");
        int a = sc.nextInt();

        System.out.print("Enter common ratio (r): ");
        int r = sc.nextInt();

        System.out.println("First 10 terms of GP:");

        for (int i = 0; i < 10; i++) {
            System.out.print(a * (int)Math.pow(r, i));

            if (i < 9) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}