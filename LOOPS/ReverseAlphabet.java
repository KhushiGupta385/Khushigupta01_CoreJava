//Print reverse alphabet from ‘Z’ to ‘A’.
public class ReverseAlphabet {
    public static void main(String[] args) {

        for (char ch = 'Z'; ch >= 'A'; ch--) {
            System.out.print(ch + " ");
        }
    }
}