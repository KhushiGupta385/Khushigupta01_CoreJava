public class SI {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter Principle Amount:");
		int p=sc.nextInt();
		System.out.println("Enter Rate:");
		double r=sc.nextDouble();
		System.out.println("Enter Time:");
		int t=sc.nextInt();
	
		double si=p*r*t/100;
		System.out.println("Simple Interest= "+si);
		
		sc.close();
	}
}
