//WAP to check if a character is an alphabet and then further check if it’s a
//vowel.
public class AlphaVowelCheck {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        ch = Character.toLowerCase(ch);

        if ((ch >= 'a' && ch <= 'z')) {
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is an Alphabet and a Vowel");
            } else {
                System.out.println(ch + " is an Alphabet and a Consonant");
            }

        } else {
            System.out.println("It is not an Alphabet");
        }
    }
}