
public class DigitCount {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int count=0;
		while(n!=0) {
			count++;
			n/=10;
		}
		if(n==0) {
			count=1;
		}
		System.out.println("No of digits: "+count);
	}
}
