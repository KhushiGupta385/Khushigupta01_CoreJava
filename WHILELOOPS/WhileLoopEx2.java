
public class WhileLoopEx2 {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int c=0;
		while(n>0) {
			n/=10;
			c++;
		}
		System.out.println("Digits: "+c);
		sc.close();
	}
}
