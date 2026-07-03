
public class IfEx {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		if(age>=13 && age<19) {
			System.out.println("You're Teenager");
		}else {
			System.out.println("You're not Teenager");
		}
		System.out.println("Thank You:");
		
		sc.close();
		
	}
}