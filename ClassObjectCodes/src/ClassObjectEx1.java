//Class is a user-defined datatype that encapsulates 
//state(variable) and behaviour(method) into a 
//single unit. 

//Encapsulation
//It is the mechanism of wrapping data(variables) and 
//methods together into a single unit and restricting 
//the direct access of the data using access modifiers.
// Variable are kept private and used by public getters/setters. 

//Abstraction
//It is the process of hiding internal implementation
//details and showing only essentail functionality 
//to the user.

//Inheritance
//It is the mechanism by which one class accquires
//the properties and behaviour of another class .

//Polymorphism
//It is the ability of a method or object to take 
//multiple forms
class Employee{
	String name;
	int salary;
	String cname;
}

public class ClassObjectEx1 {

	public static void main(String[] args) {
		//Student a=new Employee();//error
		Employee a=new Employee();
		Employee b=new Employee();
		Employee c=new Employee();
		Employee d=new Employee();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		//System.out.println(name); //error
		System.out.println(a.name+" "+a.salary+" "+a.cname);
		System.out.println(b.name+" "+b.salary+" "+b.cname);
		System.out.println(c.name+" "+c.salary+" "+c.cname);
		System.out.println(d.name+" "+d.salary+" "+d.cname);
		
		a.name="Kaliya";
		a.salary=213456;
		a.cname="ABC";
		
		b.name="Yoyo";
		b.salary=24513456;
		b.cname="XYZ";
		
		c.name="Teja";
		c.salary=213987456;
		c.cname="ASD";
		
		d.name="Bheem";
		d.salary=9876532;
		d.cname="GFD";
		
		System.out.println(a.name+" "+a.salary+" "+a.cname);
		System.out.println(b.name+" "+b.salary+" "+b.cname);
		System.out.println(c.name+" "+c.salary+" "+c.cname);
		System.out.println(d.name+" "+d.salary+" "+d.cname);
		
		int total=a.salary+b.salary+c.salary+d.salary;
		System.out.println("Total Salary: "+total);
		
	}
}