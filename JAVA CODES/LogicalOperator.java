public class LogicalOperator {
    public static void main(String[] args) {
		int a=10,b=5;
		boolean c=a++<--b && ++a!=b--;
//		boolean c=a++>--b && ++a==b--;
//		boolean c=a++<--b || ++a!=b--;
//		boolean c=a++>--b || ++a!=b--;
//		boolean c=a++<b-- && ++a>--b || a++!=b--; //(a++<b-- && ++a>--b) || a++!=b--
//		boolean c=a++<b-- && ++a>--b && a++!=b--; //(a++<b-- && ++a>--b) && a++!=b--
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		int aa=11,bb=4,cc=1;
		boolean dd = aa++<bb-- && bb++<cc++ || cc++>aa++;
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(cc);
		System.out.println(dd);
	}
}
