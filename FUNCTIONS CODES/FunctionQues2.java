
public class FunctionQues2 {
	static int m1(int y,int z) { 
		System.out.println("Hello");
		System.out.println("Ok");
		int a=y/z;
		return a;
	}
	public static void main(String[] args) {
		System.out.println("Hello Main");
		int x=m1(9,5);
		System.out.println(x);
		System.out.println("Hi Main");
		m1(6,2);
		System.out.println("Bye Main");
	}
}
