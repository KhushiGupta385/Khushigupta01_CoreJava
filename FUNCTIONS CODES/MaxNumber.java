// Write a method max(int a, int b) that returns the greater number.
public class MaxNumber {

    static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        int result = max(10, 20);
        System.out.println("Max = " + result);

        System.out.println(max(50, 30));
    }
}