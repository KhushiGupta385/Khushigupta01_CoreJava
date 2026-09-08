
public class SwitchEx4 {
	public static void main(String[] args) {
		int a=2;
		final int x=15;
		int y=3;
		switch(a) {
			case 1:
				System.out.println("Hello");
				break;
//			case y://error
//				System.out.println("Hi");
//				break;
			case x:
				System.out.println("Hello");
				break;	
			default:
				System.out.println("Invalid Number");
		}
		System.out.println("Thanks for using APP");
	}
}
