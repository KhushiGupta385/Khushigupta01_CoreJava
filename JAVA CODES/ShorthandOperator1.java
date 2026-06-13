public class ShorthandOperator1 {
    public static void main(String[] args) {
		int a=10;
		a *= 5;
		System.out.println(a);
		
		a=10;
		a /= 5;
		System.out.println(a);
		
		a=10;
		a %= 5;
		System.out.println(a);
		
		a=10;
		a %= 15;
		System.out.println(a);
		
		//a =/ 5;//error

		a=10;
		a =+ 5;
		System.out.println(a);
		
		a=10;
		a =- 5;
		System.out.println(a);
	}
}
