//WAP using switch to convert units (km to m, m to cm, etc.)
public class UnitConversion {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Unit Conversion Menu:");
        System.out.println("1. Kilometer to Meter");
        System.out.println("2. Meter to Centimeter");
        System.out.println("3. Centimeter to Meter");
        System.out.println("4. Meter to Kilometer");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter kilometers: ");
                double km = sc.nextDouble();
                System.out.println(km + " km = " + (km * 1000) + " m");
                break;

            case 2:
                System.out.print("Enter meters: ");
                double m = sc.nextDouble();
                System.out.println(m + " m = " + (m * 100) + " cm");
                break;

            case 3:
                System.out.print("Enter centimeters: ");
                double cm = sc.nextDouble();
                System.out.println(cm + " cm = " + (cm / 100) + " m");
                break;

            case 4:
                System.out.print("Enter meters: ");
                double m2 = sc.nextDouble();
                System.out.println(m2 + " m = " + (m2 / 1000) + " km");
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}