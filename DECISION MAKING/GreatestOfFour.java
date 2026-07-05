// WAP to find the greatest of four numbers.(using nested)
public class GreatestOfFour {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        System.out.print("Enter fourth number: ");
        int d = sc.nextInt();

        if (a > b) {
            if (a > c) {
                if (a > d) {
                    System.out.println("Greatest number is " + a);
                } else {
                    System.out.println("Greatest number is " + d);
                }
            } else {
                if (c > d) {
                    System.out.println("Greatest number is " + c);
                } else {
                    System.out.println("Greatest number is " + d);
                }
            }
        } else {
            if (b > c) {
                if (b > d) {
                    System.out.println("Greatest number is " + b);
                } else {
                    System.out.println("Greatest number is " + d);
                }
            } else {
                if (c > d) {
                    System.out.println("Greatest number is " + c);
                } else {
                    System.out.println("Greatest number is " + d);
                }
            }
        }
    }
}