
class A{
	String x;
	int y;
	void show() {
		System.out.println(x+" "+y);
	}
	A(String a,int b){ 
		this();
		System.out.println("Hello A");
		x=a;
		y=b;
	}
	A(String a){
		this("KK",80);
		System.out.println("Ok A");
		x=a;
	}
	A(){
		System.out.println("Hi A");
	}
}
public class ConstructorChainingEx4 {
	public static void main(String[] args) {
		A a=new A("GG");
		a.show();
	}
}