
public class ExceptionHandlingEx8 {

	public static void main(String[] args) {
		try {
			String s="292hjki";
//			String s="+292"; //Allowed
//			String s="-292"; //Allowed
//			String s="292+5"; //Not Allowed
			int a=Integer.parseInt(s);
			System.out.println(a);
		}catch (NumberFormatException ex) {
			System.out.println(ex);
		}
	}

}