
public class DMQues4 {
	public static void main(String[] args) {
		int a=10,b=5;
		if(--a*b-- >a--+--b) { 
			System.out.println(a--);
		}else {
			System.out.println(a++);
		}
		System.out.println(""+a--+b--);
		System.out.println(a+b);
	}
}
