// WAP to find the greatest of three numbers.(using nested
public class GreatestNested {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("Greatest number is " + a);
            } else {
                System.out.println("Greatest number is " + c);
            }
        } else {
            if (b > c) {
                System.out.println("Greatest number is " + b);
            } else {
                System.out.println("Greatest number is " + c);
            }
        }
    }
}