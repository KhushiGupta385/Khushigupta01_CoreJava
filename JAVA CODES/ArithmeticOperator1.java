public class ArithmeticOperator1 {

	public static void main(String[] args) {
		int a=7/2;
		System.out.println(a);
		
		double b=7/2;
		System.out.println(b);
		
		double c=7.0/2;
		System.out.println(c);
		
		//int d=7.0/2; //error
		int d=(int)(7.0/2);
		System.out.println(d);
	}
}

// Rules:
//int/int => int
//int/double => double
//double/int => double
//double/double => double
