
public class ExceptionHandlingEx17 {

	public static void main(String[] args) {
		System.out.println("Ok Main");
		System.out.println(xyz());
	}
	static int xyz() {
		try {
			System.out.println("Hello");
			System.out.println(7/0);
			return 8;
		}catch (Exception e) {
			System.out.println("Hi");
			return 5;
		}finally {
			System.out.println("Universal");
			return 10;
		}
	}
}