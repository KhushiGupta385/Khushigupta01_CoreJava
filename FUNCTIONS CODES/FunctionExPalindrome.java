
public class FunctionExPalindrome {
	static String findPalindrome(int n) {
		int c=n;
		int rev=0;
		while(n!=0) {
			int r=n%10;
			rev = rev*10 + r;
			n /= 10;
		}
		if(rev==c) {
			return c+" is Palindrome!";
		}else {
			return c+" is NOT Palindrome!";
		}
	}
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util. Scanner( System.in ); 
		
		String choice;
		do {
			System.out.println("Enter a no.: ");
			int a=sc.nextInt();
			System.out.println(findPalindrome(a));
			
			System.out.println("Continue?[y/n]");
			choice=sc.next();
		}while(choice.equalsIgnoreCase("y"));
		
		System.out.println("Thanks for using My APP!");
		sc.close();
	}
}
