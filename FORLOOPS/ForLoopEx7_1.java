
public class ForLoopEx7_1 {
	public static void main(String[] args) {

		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter start number:");
		int n1=sc.nextInt();
		System.out.println("Enter end number:");
		int n2=sc.nextInt();
		int sum=0;
		for(int a=n1;a<=n2;a++) {
			sum += a; //sum= sum+a;
		}
		System.out.println("Addition: "+sum);
		
		sc.close();
	}
}
