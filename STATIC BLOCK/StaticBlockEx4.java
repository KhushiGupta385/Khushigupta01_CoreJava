
class KK{
	static {
		System.out.println("Hello C");
	}
	String x;
	static int y;
	static {
		System.out.println("Hi C");
		System.out.println(y++);
	}
	void m() {
		x=y++ +"Ram";
	}
}
public class StaticBlockEx4 {
	public static void main(String[] args) {
		System.out.println(KK.y);
		KK k1=new KK();
		KK k2=new KK();
		System.out.println("Hello Main");
		k1.m();
		k2.m();
		k1.m();
		System.out.println(k1.x+" "+k1.y);
		System.out.println(k2.x+" "+k2.y);
	}
}