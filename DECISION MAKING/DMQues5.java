public class DMQues5 {
	public static void main(String[] args) {
		int a=10,b=5;
		if(--a!=b--) { 
			System.out.println(a--+--b);
		}else {
			System.out.println(a++-++b);
		}
		System.out.println(""+a+b);
	}
}
