//Write a method isEven(int n) that returns true if the number is even, otherwise false
public class EvenNumber {

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        boolean result = isEven(10);
        System.out.println(result);  // true

        System.out.println(isEven(7)); // false
    }
}