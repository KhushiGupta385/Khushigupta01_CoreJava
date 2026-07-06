// WAP to find the largest among three numbers using nested if
public class LargestNested {
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
                System.out.println("Largest number is " + a);
            } else {
                System.out.println("Largest number is " + c);
            }
        } else {
            if (b > c) {
                System.out.println("Largest number is " + b);
            } else {
                System.out.println("Largest number is " + c);
            }
        }
    }
}