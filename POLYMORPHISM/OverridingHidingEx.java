
class A{
	void m1() {
		System.out.println("Hello A");
	}
	void xyz() {
		System.out.println("yhjudsgfdhjs");
	}
}
class B extends A{
	void m1() {  //Method overriding
		System.out.println("Hello B");
	}
}
public class OverridingHidingEx {
	public static void main(String[] args) {
		B b=new B();
		b.m1();
		b.xyz();
	}
}