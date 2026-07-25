
public class FunctionEx6 {
	static String findEvenOdd(int a) {
		if(a%2==0) {
			return a+" is Even";
		}else {
			return a+" is Odd";
		}
	}
	public static void main(String[] args) {
		int n=17;
		String r=findEvenOdd(n);
		System.out.println(r);
	}
}