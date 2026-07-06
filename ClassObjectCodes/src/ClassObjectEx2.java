class Emp{
	
	//System.out.println("Hello Employee"); //error
	
	void m() {
		System.out.println("Hello Employee");
	}
	
	String name="asdasd"; //Data Member/Field/Class Level Variable  / State/Attributes/Properties
	int salary; //Data Member/Field/Class Level Variable  / State
	String cname; //Data Member/Field/Class Level Variable  / State
	
	void show() {  //Member Function/Method  / Behavior
		System.out.println(name+" "+salary+" "+cname);
	}
	void input(String n,int s,String c) {   //Member Function/Method  / Behavior
		name=n;
		salary=s;
		cname=c;
	}
}
public class ClassObjectEx2 {

	//System.out.println("Hello Main"); //error
	
	public static void main(String[] args) {
		System.out.println("Hello Main");
		Emp a=new Emp();
		Emp b=new Emp();
		Emp c=new Emp();
		Emp d=new Emp();
		
		a.m();
		
		//show();//error
		a.show();
		b.show();
		c.show();
		d.show();
		
		a.input("Cheetah Khan", 100000000, "ABC");
		b.input("Yoyo Gupta", 890000, "XYZ");
		c.input("Kaliya Singh", 750000000, "MNO");
		d.input("Teja Singh", 740000, "PQR");
		
		a.show();
		b.show();
		c.show();
		d.show();
		
		int total=a.salary+b.salary+c.salary+d.salary;
		System.out.println("Total Salary: "+total);
		
		a.m();
	}
}