// WAP to check whether a character is uppercase or lowercase
public class UpperLowerCase {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is Uppercase");
        } 
        else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is Lowercase");
        } 
        else {
            System.out.println("Invalid input");
        }
    }
}