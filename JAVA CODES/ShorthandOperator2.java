public class ShorthandOperator2 {
    public static void main(String[] args) {
		byte a=12;
//		a=a+5; //error
		a+=5; //-> a=(byte)(a+5);
		System.out.println(a);
		
		
		int aa=4,bb=5,cc=0;
		aa+=cc-=bb;
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(cc);
		
		int a1=4,b=5,c=6,d=7;
		d*=a1+b/c;
		System.out.println(d);
	
	}
}
