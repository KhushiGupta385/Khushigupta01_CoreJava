// WAP to check whether a character is a vowel or consonant.
public class VowelConsonant {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        ch = Character.toLowerCase(ch);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a Vowel");
        } else {
            System.out.println(ch + " is a Consonant");
        }
    }
}