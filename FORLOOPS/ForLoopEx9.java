
public class ForLoopEx9 {
	public static void main(String[] args) {

		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int mul=1;
		for(int a=1;a<=n;a++) {
			mul*=a;
			System.out.print(a);
			if(a!=n) {
				System.out.print("*");
			}
		}
		System.out.println("="+mul);
		
		sc.close();
	}
}
