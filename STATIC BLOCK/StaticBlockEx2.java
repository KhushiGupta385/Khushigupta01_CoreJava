
class B{
	static {
		System.out.println("Hello B");
	}
	String x;
	int y;
	void show() {				
		System.out.println(x+" "+y);
	}
	static {
		System.out.println("Hi B");
	}
}
public class StaticBlockEx2 {
	public static void main(String[] args) {
		System.out.println("Hello Main");
		B b1=new B();
		B b2=new B();
		b1.show();
		b2.show();
		System.out.println("Bye Main");
	}
}