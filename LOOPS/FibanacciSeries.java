
public class FibanacciSeries {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		int a=0, b=1;
		System.out.print(a+" "+b+" ");
		for(int x=1;x<=n-2;x++) {
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		
		sc.close();
	}
}
