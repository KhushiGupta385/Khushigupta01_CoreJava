//Write a method square(int n) that returns the 
public class Square {

    static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        int result = square(5);
        System.out.println("Square = " + result);

        System.out.println(square(7));
    }
}