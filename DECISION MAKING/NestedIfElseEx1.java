//WAP to check whether a no. is positive, negative or zero. If the number is positive also print wheter its even or odd.
public class NestedIfElseEx1 {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter your age:");
		int a=sc.nextInt();
		
		if(a<=0 || a>120) {
			System.out.println("Invalid Age!");
		}else{
			if(a>=13 && a<=19) {
				System.out.println("You are Teenager!");
			}else {
				System.out.println("You are NOT Teenager!");
			}
		}
		
		System.out.println("Thanks for using APP");
		
		sc.close();
	}

}
