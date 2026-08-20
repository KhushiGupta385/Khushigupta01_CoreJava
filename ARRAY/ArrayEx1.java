
public class ArrayEx1 {
	public static void main(String[] args) {
		//Without Array:
//		int a=90;
//		int b=3;
//		int c=6;
//		int d=8;
		
		//With Array:
		int[]  a;//Array Declaration
		//int []a;//allowed
		a=new int[4];//Array Creation
		a[0]=90;//Array Initialization
		a[1]=3;//Array Initialization
		a[2]=6;//Array Initialization
		a[3]=8;//Array Initialization
		
		System.out.println(a);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		
		//Normal For loop
		for(int x=0;x<a.length;x++) {
			System.out.println(a[x]);
		}
		//For-Each (Enhanced For) loop
		for(int x:a) { 
			System.out.println(x);
		}
		
	}
}
