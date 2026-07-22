
public class ExceptionHandlingEx12 {
	public static void main(String[] args) {
		System.out.println("Hello");
		try {
			int r=7/0;
			System.out.println("Division: "+r);
		}catch (NullPointerException ae) {
			System.out.println("Hi");
		}finally {
			System.out.println("ok");
			try {
				int u=9/0;
			}finally {
				System.out.println("paglu");
			}
			System.out.println("Universal");
		}
		System.out.println("Bye");
	}

}