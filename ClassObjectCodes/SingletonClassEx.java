
//Singleton Class
class M{
	private M() {
		
	}
	static private M m = new M();
	static public M getInstance(){
		return m;
	}
}
public class SingletonClassEx {
	public static void main(String[] args) {
		M m1 = M.getInstance();
		M m2 = M.getInstance();
		System.out.println(m1);
		System.out.println(m2);
	}
}