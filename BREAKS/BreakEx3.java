
public class BreakEx3 {
	public static void main(String[] args) {
		int a=1;
		do {
			System.out.println("Rahul");
			if(a++>3){
				break;
			}
			System.out.println("Pandey");
		}while(a<=5);
		System.out.println("Bye");
	}
}
