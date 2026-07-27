
public class FunctionExSI_2 {
	static double findSI() {
		java.util.Scanner sc=new java.util. Scanner( System.in );
		
		System.out.println("Enter Principle: ");
		double p=sc.nextDouble();
		System.out.println("Enter Rate: ");
		double r=sc.nextDouble();
		System.out.println("Enter Time: ");
		double t=sc.nextDouble();
		
		double si=p*r*t/100;
		
		return si;
	}
	public static void main(String[] args) {
		double result;
		
		result=findSI();
		System.out.println("Simple Interest is "+result);
		
		result=findSI();
		System.out.println("Simple Interest is "+result);
		
		
	}
}
