//WAP to find the greatest of three numbers
public class GreatestThree {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a >= b && a >= c)
            System.out.println("Greatest number is " + a);
        else if (b >= a && b >= c)
            System.out.println("Greatest number is " + b);
        else
            System.out.println("Greatest number is " + c);
    }
}