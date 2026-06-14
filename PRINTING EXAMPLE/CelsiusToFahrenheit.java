public class CelsiusToFahrenheit {
    public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter a Celsius value:");
		double c=sc.nextDouble();
		double f=(9/5.0 * c) + 32;
		System.out.println("Fahrenheit: "+f);
		
		sc.close();
	}
}
