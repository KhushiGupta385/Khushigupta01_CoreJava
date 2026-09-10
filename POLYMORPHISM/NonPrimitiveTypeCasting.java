class A1{
	
}
class B1 extends A1{
	
}
class C{
	
}
public class NonPrimitiveTypeCasting {

	public static void main(String[] args) {
		A1 a1=new B1();  //upcasting - Storing child's object in parent refrence type.
//		B1 b1=new A1();  //C.T.E
		
		B1 b1=(B1)a1;   //downcasting
		
//		B1 b2=(B1)new A1(); //R.T.E -ClassCastException
		
		
	}
}
