
class MyException extends RuntimeException{ //Reported Exception(Unchecked Exception)
	@Override
	public String getMessage() {
		return "Invalid Age";
	}
}
class MeraException extends Exception{ //UnReported Exception(Checked Exception)
	@Override
	public String getMessage() {
		return "Invalid Age";
	}
}
class Employee{
	private int age;
	public void setAge(int a) throws MeraException {
		if(a<=0 || a>120) {
			throw new MeraException();
		}else {
			age=a;
		}
	}
	public int getAge() {
		return age;
	}
}
public class ExceptionHandlingEx14{
	public static void main(String[] args)   {
		try {
			Employee s=new Employee();
			s.setAge(12);
			System.out.println("Your age: "+s.getAge());
		}catch (MeraException e) {
			System.out.println(e);
		}
		System.out.println("Bye");
		
	}
}