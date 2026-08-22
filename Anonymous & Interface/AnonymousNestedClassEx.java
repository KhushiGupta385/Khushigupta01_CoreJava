
class Abc{
	void m1() {
		System.out.println("Hello ABC");
	}
	void m2() {
		System.out.println("Hi ABC");
	}
}
interface Xyz{
	void m();
	void mm();
}

public class AnonymousNestedClassEx {
	public static void main(String[] args) {
		
		
		Abc a=new Abc(){
			@Override
			void m1() {
				System.out.println("kjdfghdfkjghj");
			}
			@Override
			void m2() {
				show();
				System.out.println("dfkjghkjdfhgdfkj");
			}
			void show() {
				System.out.println("Universal");
			}
			static {
				System.out.println("OK static");
			}
			{
				System.out.println("OK initialize");
			}
		};
		a.m1();
		a.m2();
		//a.show(); //error
		
		Xyz x=new Xyz() {
			@Override
			public void m() {
				System.out.println("kkkkkkkkk");
			}
			@Override
			public void mm() {
				System.out.println("hhhhhhhh");
			}
		};
		x.m();
		x.mm();
	}
}