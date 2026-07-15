
class Emp{
	String name;
	int age;
	String cname;
	int salary;
	void show() {
		System.out.println(name+" "+age+" "+cname+" "+salary);
	}
	Emp(String n,int s){
		name=n;
		salary=s;
	}
	Emp(String n,int s,String c,int a){
		this(n,s);
		cname=c;
		age=a;
	}
}
public class ConstructorChainingEx1 {
	public static void main(String[] args) {
		Emp a1=new Emp("Gogo",89000);
		Emp a2=new Emp("Ram",95000,"Abc",23);
		a1.show();
		a2.show();
	}
}