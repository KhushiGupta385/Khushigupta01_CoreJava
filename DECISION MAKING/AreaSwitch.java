//WAP using switch to calculate area (circle, square, rectangle, triangle)
public class AreaSwitch {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Choose shape:");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Triangle");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                System.out.println("Area of Circle = " + (3.14 * r * r));
                break;

            case 2:
                System.out.print("Enter side: ");
                double s = sc.nextDouble();
                System.out.println("Area of Square = " + (s * s));
                break;

            case 3:
                System.out.print("Enter length: ");
                double l = sc.nextDouble();

                System.out.print("Enter breadth: ");
                double b = sc.nextDouble();

                System.out.println("Area of Rectangle = " + (l * b));
                break;

            case 4:
                System.out.print("Enter base: ");
                double base = sc.nextDouble();

                System.out.print("Enter height: ");
                double h = sc.nextDouble();

                System.out.println("Area of Triangle = " + (0.5 * base * h));
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}