public class FunctionEx4 {
	static int add(int x,int y) {
		int r=x+y;
		System.out.println("Hello ADD");
		return r;
	}
	public static void main(String[] args) {
		int s=add(5,8);
		System.out.println("Sum: "+s);
		
		System.out.println("Sum: "+add(6,4));
		
		add(7,2);//allowed
	}
}