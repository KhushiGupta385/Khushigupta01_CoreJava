public class FunctionEx3 {
		static int add() {
			int x=10,y=20;
			int r=x+y;
			System.out.println("Hii");
			return r;
			//System.out.println("Hi"); //error - unreachable statement
		}
		public static void main(String[] args) {
			int s=add();
			System.out.println("Sum: "+s);
			
			System.out.println("Sum: "+add());
			
			add();//allowed
		}
}
