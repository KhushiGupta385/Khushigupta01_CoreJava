//WAP to find largest among three numbers using nested ?:
	public class LargestTernary {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int largest = (a > b) 
                        ? ((a > c) ? a : c) 
                        : ((b > c) ? b : c);

        System.out.println("Largest number is " + largest);
    }
}