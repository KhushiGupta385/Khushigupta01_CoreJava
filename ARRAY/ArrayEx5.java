
public class ArrayEx5 {
	public static void main(String[] args) {
		int aa[]=new int[]{8,3,10,5,7,2,4,5,1,5};
		
		System.out.println(aa[5]);
		show(aa); //call or pass by reference 
		System.out.println(aa[5]);
		
		int i=10;
		System.out.println(i);
		print(aa[3]); //call or pass by value 
		System.out.println(i);
	}
	static void show(int b[]) {
		b[5]=9000;
	}
	static void print(int x) {
		x=9000;
	}
}