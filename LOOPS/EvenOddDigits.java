//Count number of even and odd digits in a number.
public class EvenOddDigits {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int evenCount = 0;
        int oddCount = 0;

        while (num != 0) {
            int digit = num % 10;

            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            num = num / 10;
        }

        System.out.println("Even digits = " + evenCount);
        System.out.println("Odd digits = " + oddCount);

        sc.close();
    }
}