
public class ForLoopEx10 {
public static void main(String[] args) {
		
		System.out.println("Hello");
		for(int a=1;a<=5;a++) {
			System.out.println(a++ +"Hi");
		}
		
		
		int a;
		for(a=1;a++<=7;a++) {
			System.out.println("Hello"+a++);
		}
		System.out.println("Bye"+a);
		
		
		
		
		
		int x;
		for(x=1;++x<=12;++x) {
			System.out.println("Hello"+x++ + ++x);
		}
		
		System.out.println("Bye"+x);
		
		
	}
}
