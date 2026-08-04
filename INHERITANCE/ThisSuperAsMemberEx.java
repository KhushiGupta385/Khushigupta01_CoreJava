
class X {  
	int a=10;
	void print() {
		System.out.println("Hello X");
	}
}
class Y extends X{
	static int b=20;	//class-level variable(class variable)
	int a=70;			//class-level variable(Instance Variable)
	void m() {
		int c=30;		//local for this m()
		int a=50;
		System.out.println(a);//50
		System.out.println(this.a);//70
		System.out.println(super.a);//10
		System.out.println(b);//20
		System.out.println(this.b);
		System.out.println(c);//30
		print(); //Hello Y
		this.print(); //Hello Y
		super.print(); //Hello X
	}
	void print() {
		System.out.println("Hello Y");
	}
}
public class ThisSuperAsMemberEx {
	public static void main(String[] args) {
		Y y=new Y();
		System.out.println(y.a);//70
		//System.out.println(y.super.a);//error
		y.print();//Hello Y
		y.m();
		
		X x=new X();
		System.out.println(x.a);//10
		x.print();//Hello X
	}
}


//Constructor Chaining
//this();   -->Chaining same class constructor
//super();  -->Chaining parent class constructor
//
////Member Chaining
//this.  -->Uses current object
//super. -->Uses parent object