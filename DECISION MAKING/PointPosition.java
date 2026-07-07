//WAP to check whether a point lies on the x-axis, y-axis, or origin
public class PointPosition {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter x coordinate: ");
        int x = sc.nextInt();

        System.out.print("Enter y coordinate: ");
        int y = sc.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("Point lies on Origin");
        }
        else if (x == 0) {
            System.out.println("Point lies on Y-axis");
        }
        else if (y == 0) {
            System.out.println("Point lies on X-axis");
        }
        else {
            System.out.println("Point does not lie on X-axis or Y-axis");
        }
    }
}