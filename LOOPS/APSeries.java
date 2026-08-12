//Print first 10 terms of the arithmetic progression (AP).
public class APSeries {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter first term (a): ");
        int a = sc.nextInt();

        System.out.print("Enter common difference (d): ");
        int d = sc.nextInt();

        System.out.println("First 10 terms of AP:");

        for (int i = 0; i < 10; i++) {
            System.out.print(a + (i * d));

            if (i < 9) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}