
public class ExceptionHandlingEx1 {
	public static void main(String[] args) {
		System.out.println("Hello");
		int a = 12, b = 0, r = 0;
		try {
			r = a / b;
			System.out.println("Division: " + r);
		}catch(ArithmeticException e) {
			System.out.println("Exception aaya re!!");
		}
		System.out.println("Bye");
	}
}
