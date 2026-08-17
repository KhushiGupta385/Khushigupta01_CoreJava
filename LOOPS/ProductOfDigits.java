//Print the product of digits of a number.
public class ProductOfDigits {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int product = 1;

        while (num > 0) {
            int digit = num % 10;
            product = product * digit;
            num = num / 10;
        }

        System.out.println("Product of digits = " + product);
    }
}