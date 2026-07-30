//Write a method max3(int a, int b, int c) that returns the largest number
public class MaxThree {

    static int max3(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        int result = max3(10, 25, 15);
        System.out.println("Max = " + result);

        System.out.println(max3(50, 30, 80));
    }
}