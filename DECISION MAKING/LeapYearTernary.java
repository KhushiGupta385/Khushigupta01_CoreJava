//WAP to check whether a year is leap year or not using ?
public class LeapYearTernary {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        String result = ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
                        ? "Leap Year"
                        : "Not a Leap Year";

        System.out.println(year + " is " + result);
    }
}