
class Student{
	private int age;
	public void setAge(int a) {
		if(a<0  || a>120) {
			throw new ArithmeticException();
//			ArithmeticException ae=new ArithmeticException("Invalid Age");
//			throw ae;
		}else {
			age=a;
		}
	}
	public int getAge() {
		return age;
	}
}
public class ExceptionHandlingEx13 {
	public static void main(String[] args) {
		try {
			Student s=new Student();
			s.setAge(-25);
			System.out.println("Your age: "+s.getAge());
		}catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("Bye");
	}
}