//Print Pascal’s triangle (only first 5 rows).
public class PascalsTriangle {
    public static void main(String[] args) {

        int rows = 5;

        for (int i = 0; i < rows; i++) {

            // Print spaces
            for (int space = 0; space < rows - i - 1; space++) {
                System.out.print(" ");
            }

            int value = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}