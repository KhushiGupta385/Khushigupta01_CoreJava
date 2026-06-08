public class BitwiseOperator {
    public static void main(String[] args) {
		int a=5,b=3;
		int r;
		r=a&b;
		System.out.println(r);
		r=a|b;
		System.out.println(r);
		r=a^b;
		System.out.println(r);
		r=a>>1;
		System.out.println(r);
		r=a<<1;
		System.out.println(r);
		r=~a;
		System.out.println(r);
		
//		System.out.println(2.5|1.4); //Error
	}

}