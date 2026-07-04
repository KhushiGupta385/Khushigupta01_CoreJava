// WAP to find the absolute value of a number.
public class AbsoluteValue {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 0) {
            num = -num;
        }

        System.out.println("Absolute value is " + num);
    }
}