//WAP to find the greatest of two numbers.
public class GreaterNumber{
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a > b)
            System.out.println("Greatest number is " + a);
        else if (b > a)
            System.out.println("Greatest number is " + b);
        else
            System.out.println("Both numbers are equal");
    }
}