
public class EvenOdd {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		
		if(a%2==0) {
			System.out.println(a+" is Even");
		}else {
			System.out.println(a+" is ODD");
		}
		
		System.out.println("Thanks for using APP");
		
		sc.close();
	}
}
